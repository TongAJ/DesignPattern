package com.design.mode.factory.method.impl;

import com.design.mode.factory.method.LoggerFactory;
import com.design.mode.factory.method.beans.logger.Logger;
import com.design.mode.factory.method.beans.logger.impl.FileLogger;

/**
 * @author AJ
 * 文件日志记录器工厂类：具体工厂
 */
public class FileLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        //创建文件日志记录器对象
        Logger logger = new FileLogger();
        //创建文件，代码省略
        return logger;
    }
}
