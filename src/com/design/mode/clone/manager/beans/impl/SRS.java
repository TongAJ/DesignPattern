package com.design.mode.clone.manager.beans.impl;

import com.design.mode.clone.manager.beans.OfficialDocument;

/**
 * 描述:
 * 软件需求规格说明书(Software Requirements Specification)类
 *
 * @author Administrator
 * @create 2018-09-18 10:45
 */
public class SRS implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument srs = null;
        try
        {
            srs = (OfficialDocument)super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("不支持复制！");
        }
        return srs;
    }

    @Override
    public void display() {
        System.out.println("《软件需求规格说明书》");
    }
}
