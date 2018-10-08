package com.design.mode.bridge;

/**
 * 描述:
 * Mysql数据库文件
 *
 * @author Administrator
 * @create 2018-10-08 10:26
 */
public class MySqlFile extends AbstractFile {
    @Override
    public void setDB() {
        System.out.println("Mysql 数据库");
        fileFormatter.showFile();
    }
}
