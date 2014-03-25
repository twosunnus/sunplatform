package com.sunnus.sunplatform.component.ztree;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * 
 * @author: sunqichang
 * @Date: 14-3-18
 * @Time: 下午5:00
 */
public interface ZTreeJsonBeanProcessor extends net.sf.json.processors.JsonBeanProcessor {

    /**
     * 得到组成树的数据的list
     * 
     * @param paramMap
     * @return
     */
    public List getTreeList(Map paramMap);

    /**
     * 返回需要转JSON串的Class
     * 
     * @return
     */
    public Class[] getBeanClass();

    /**
     * 定义树展现的规则
     */
    public JSONObject processBean(Object arg0, JsonConfig arg1);
}
