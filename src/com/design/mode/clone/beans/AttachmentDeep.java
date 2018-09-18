package com.design.mode.clone.beans;

import java.io.Serializable;

/**
 * 描述:
 * 附件类
 *
 * @author Administrator
 * @create 2018-09-18 9:31
 */
public class AttachmentDeep implements Serializable {
    /**
     * 附件名
     */
    private String name;
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void download()
    {
        System.out.println("下载附件，文件名为" + name);
    }
}
