package com.sunnus.sunplatform.component.ztree;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonBeanProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by eclipse.
 * User: tanghengqiang
 * Date: 2010-12-27
 * Time: 14:48:23
 * 树节点
 */
public class ZTreeServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(ZTreeServlet.class);

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> paramMap = new HashMap<String, String>();
        Enumeration param = request.getParameterNames();
        while (param.hasMoreElements()) {
            String paramName = (String) param.nextElement();
            String paramValue = request.getParameter(paramName);
            paramMap.put(paramName, paramValue);
        }
        try {
            Class classImpl = Class.forName(paramMap.get("configBean"));
            ZTreeJsonBeanProcessor jsonBeanProcessor = (ZTreeJsonBeanProcessor) classImpl.newInstance();
            JSONArray childNodeArray = new JSONArray();
            List childNodeList = jsonBeanProcessor.getTreeList(paramMap);
            if (childNodeList != null) {
                JsonConfig jsonConfig = this.getJsonConfig(jsonBeanProcessor.getBeanClass(), jsonBeanProcessor);
                childNodeArray.addAll(childNodeList, jsonConfig);
            }
            // response.getOutputStream().write(childNodeArray.toString().getBytes("utf-8"));
            response.getOutputStream().write(childNodeArray.toString().replace("{},", "").replace(",{}", "").replace("{}", "").getBytes("utf-8"));
            response.flushBuffer();
        } catch (Exception e) {
            logger.error("构造树异常", e);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("progma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("progma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        processRequest(request, response);
    }

    public void init() throws ServletException {
    }

    private JsonConfig getJsonConfig(Class[] classes, JsonBeanProcessor jsonBeanProcessor) {
        JsonConfig jsonConfig = new JsonConfig();
        for (Class c : classes) {
            jsonConfig.registerJsonBeanProcessor(c, jsonBeanProcessor);
        }
        return jsonConfig;
    }
}
