package com.design.mode.clone.manager.beans;

/**
 * 描述:
 * 文件接口
 *
 * @author Administrator
 * @create 2018-09-18 10:42
 */
public interface OfficialDocument extends Cloneable {
    /**
     * 克隆方法
     * @return
     */
    public OfficialDocument clone();

    /**
     * display
     */
    public void display();
}
