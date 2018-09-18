package com.design.mode.clone.manager.beans.impl;

import com.design.mode.clone.manager.beans.OfficialDocument;

/**
 * 描述:
 * 可行性分析报告(Feasibility Analysis Report)类
 *
 * @author Administrator
 * @create 2018-09-18 10:45
 */
public class FAR implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try
        {
            far = (OfficialDocument)super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("不支持复制！");
        }
        return far;
    }

    @Override
    public void display() {
        System.out.println("《可行性分析报告》");
    }
}
