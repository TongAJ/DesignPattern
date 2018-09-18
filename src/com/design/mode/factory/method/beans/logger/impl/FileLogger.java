package com.design.mode.factory.method.beans.logger.impl;

import com.design.mode.factory.method.beans.logger.Logger;

/**
 * @author AJ
 * 文件日志记录器：具体产品
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录。");
    }
}
