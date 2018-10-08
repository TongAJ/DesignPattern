package com.design.mode.bridge;

/**
 * 描述:
 * Pdf文件格式
 *
 * @author Administrator
 * @create 2018-10-08 10:15
 */
public class PdfFormatter implements FileFormatter{
    @Override
    public void showFile() {
        System.out.println("PDF 文件格式");
    }
}
