package com.sunnus.sunplatform.component.ztree;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * 
 * @author: sunqichang
 * @Date: 14-3-18
 * @Time: 下午5:41
 */
public class ZTreeDemo implements ZTreeJsonBeanProcessor {

    /**
     * 得到组成树的数据的list
     * 
     * @param paramMap
     * @return
     */
    @Override
    public List getTreeList(Map paramMap) {
        List list = new ArrayList();
        return list;
    }

    /**
     * 返回需要转JSON串的Class
     * 
     * @return
     */
    @Override
    public Class[] getBeanClass() {
        return new Class[0];
    }

    /**
     * 定义树展现的规则
     * 
     * @param arg0
     * @param arg1
     */
    @Override
    public JSONObject processBean(Object arg0, JsonConfig arg1) {
        return null;
    }
}
