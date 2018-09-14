package com.design.mode.factory;

import com.design.mode.factory.beans.logger.Logger;

/**
 * @author AJ
 * 日志记录器工厂接口：抽象工厂
 *      优点：解决了简单工厂功能太重的问题，也在扩展性上得到了提升
 *      缺点：由于一个具体产品需要一个工厂，会有很多个工厂，增加系统开销
 *           当需要增加新产品时，虽然不需要修改原来的代码，但增加大量的代码来完成新功能
 *
 */
public interface LoggerFactory{
    /**
     * Create Logger
     * @return
     */
    public Logger createLogger();
}
