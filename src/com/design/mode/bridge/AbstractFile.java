package com.design.mode.bridge;

/**
 * 描述:
 * 抽象类：文件
 *
 * @author Administrator
 * @create 2018-10-08 10:20
 */
public abstract class AbstractFile {
    protected FileFormatter fileFormatter;

    public void setFileFormatter(FileFormatter fileFormatter){
        this.fileFormatter = fileFormatter;
    }

    /**
     * 设置数据属于哪种数据库
     */
    public abstract void setDB();
}
