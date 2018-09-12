package com.design.mode.factory.impl;

import com.design.mode.factory.LoggerFactory;
import com.design.mode.beans.logger.Logger;
import com.design.mode.beans.logger.impl.DatabaseLogger;

/**
 * 数据库日志记录器工厂类：具体工厂
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        //连接数据库，代码省略
        //创建数据库日志记录器对象
        Logger logger = new DatabaseLogger();
        //初始化数据库日志记录器，代码省略
        return logger;
    }
}
