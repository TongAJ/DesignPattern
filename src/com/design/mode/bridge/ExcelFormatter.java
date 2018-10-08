package com.design.mode.bridge;

/**
 * 描述:
 * Excel文件格式
 *
 * @author Administrator
 * @create 2018-10-08 10:15
 */
public class ExcelFormatter implements FileFormatter {
    @Override
    public void showFile() {
        System.out.println("Excel 文件格式");
    }
}
