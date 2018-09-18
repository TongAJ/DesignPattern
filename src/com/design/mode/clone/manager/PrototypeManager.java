package com.design.mode.clone.manager;

import com.design.mode.clone.manager.beans.OfficialDocument;
import com.design.mode.clone.manager.beans.impl.FAR;
import com.design.mode.clone.manager.beans.impl.SRS;

import java.util.Hashtable;

/**
 * 描述:
 * 原型管理器（使用饿汉式单例实现）
 *
 * @author Administrator
 * @create 2018-09-18 12:09
 */
public class PrototypeManager {
    private static PrototypeManager pm = new PrototypeManager();
    private Hashtable ht = new Hashtable();

    private PrototypeManager(){
        ht.put("far",new FAR());
        ht.put("srs",new SRS());
    }

    public static PrototypeManager getPrototypeManager(){
        return pm;
    }

    /**
     * 通过浅克隆获取新的公文对象
     * @param key
     * @return OfficeDocument
     */
    public OfficialDocument getOfficialDocument(String key){
        return ((OfficialDocument)ht.get(key)).clone();
    }

    /**
     * 增加新的公文对象
     * @param key
     * @param doc
     */
    public void addOfficialDocument(String key, OfficialDocument doc)
    {
        ht.put(key,doc);
    }


}
