package com.design.mode.clone;

import com.design.mode.clone.beans.AttachmentDeep;
import com.design.mode.clone.beans.AttachmentShallow;
import com.design.mode.clone.deep.WeeklyLogDeep;
import com.design.mode.clone.shallow.WeeklyLogShallow;
import org.junit.Test;

/**
 * 描述:
 * 测试类
 *
 * @author Administrator
 * @create 2018-09-18 9:32
 */
public class CloneTest {

    @Test
    public void testClone() throws CloneNotSupportedException {
        //创建原型对象
        WeeklyLog log_previous = new WeeklyLog();
        log_previous.setName("张无忌");
        log_previous.setDate("第12周");
        log_previous.setContent("这周工作很忙，每天加班！");
        System.out.println("****周报****");
        System.out.println("周次：" + log_previous.getDate());
        System.out.println("姓名：" + log_previous.getName());
        System.out.println("内容：" + log_previous.getContent());
        System.out.println("--------------------------------");
        //调用克隆方法创建克隆对象
        WeeklyLog log_new = (WeeklyLog)log_previous.clone();
        log_new.setDate("第13周");
        System.out.println("****周报****");
        System.out.println("周次：" + log_new.getDate());
        System.out.println("姓名：" + log_new.getName());
        System.out.println("内容：" + log_new.getContent());


        System.out.println(log_previous == log_new);
        System.out.println(log_previous.getDate() == log_new.getDate());
        System.out.println(log_previous.getName() == log_new.getName());
        System.out.println(log_previous.getContent() == log_new.getContent());
    }

    @Test
    public void testShallow() throws CloneNotSupportedException{
        WeeklyLogShallow log_previous, log_new;
        //创建原型对象
        log_previous = new WeeklyLogShallow();
        //创建附件对象
        AttachmentShallow attachment = new AttachmentShallow();
        //将附件添加到周报中
        log_previous.setAttachment(attachment);
        //调用克隆方法创建克隆对象
        log_new = log_previous.clone();
        //比较周报
        System.out.println("周报是否相同？ "
                + (log_previous == log_new));
        //比较附件
        System.out.println("附件是否相同？ "
                + (log_previous.getAttachment() == log_new.getAttachment()));
    }


    @Test
    public void testDeepClone() throws Exception{
        WeeklyLogDeep log_previous, log_new;
        //创建原型对象
        log_previous = new WeeklyLogDeep();
        //创建附件对象
        AttachmentDeep attachment = new AttachmentDeep();
        //将附件添加到周报中
        log_previous.setAttachment(attachment);
        //调用克隆方法创建克隆对象
        log_new = log_previous.clone();
        //比较周报
        System.out.println("周报是否相同？ "
                + (log_previous == log_new));
        //比较附件
        System.out.println("附件是否相同？ "
                + (log_previous.getAttachment() == log_new.getAttachment()));
    }

}
