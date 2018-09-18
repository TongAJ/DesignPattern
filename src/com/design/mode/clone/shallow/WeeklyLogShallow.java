package com.design.mode.clone.shallow;

import com.design.mode.clone.beans.AttachmentShallow;

/**
 * 描述:
 * 工作周报WeeklyLog：具体原型类，考虑到代码的可读性和易理解性，只列出部分与模式相关的核心代码
 * 为了简化设计和实现，假设一份工作周报中只有一个附件对象，实际情况中可以包含多个附件，
 * 可以通过List等集合对象来实现
 *
 * @author Administrator
 * @create 2018-09-17 17:00
 */
public class WeeklyLogShallow implements Cloneable{

    private AttachmentShallow attachment;
    private String name;
    private String date;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public AttachmentShallow getAttachment() {
        return attachment;
    }

    public void setAttachment(AttachmentShallow attachment) {
        this.attachment = attachment;
    }

    @Override
    public String toString() {
        return "WeeklyLog{" +
                "attachment=" + attachment +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public WeeklyLogShallow clone() throws CloneNotSupportedException {
        return (WeeklyLogShallow)super.clone();
    }
}


