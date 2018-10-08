package com.design.mode.bridge;

/**
 * 描述:
 * Oracle数据库文件
 *
 * @author Administrator
 * @create 2018-10-08 10:25
 */
public class OracleFile extends AbstractFile {
    @Override
    public void setDB() {
        System.out.println("使用Oracle");
        fileFormatter.showFile();
    }
}
