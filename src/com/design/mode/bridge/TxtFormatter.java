package com.design.mode.bridge;

/**
 * 描述:
 * txt文件格式
 *
 * @author Administrator
 * @create 2018-10-08 10:16
 */
public class TxtFormatter implements FileFormatter {
    @Override
    public void showFile() {
        System.out.println("Txt 文件格式");
    }
}
