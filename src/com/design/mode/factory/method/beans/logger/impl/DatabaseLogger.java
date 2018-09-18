package com.design.mode.factory.method.beans.logger.impl;

import com.design.mode.factory.method.beans.logger.Logger;

/**
 * 数据库日志记录器：具体产品
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录。");
    }
}
