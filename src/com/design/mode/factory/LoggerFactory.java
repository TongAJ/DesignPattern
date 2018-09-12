package com.design.mode.factory;

import com.design.mode.factory.beans.logger.Logger;

/**
 * @author AJ
 * 日志记录器工厂接口：抽象工厂
 */
public interface LoggerFactory{
    /**
     * Create Logger
     * @return
     */
    public Logger createLogger();
}
