package com.design.mode.factory.method;

import com.design.mode.factory.method.beans.logger.Logger;
import com.design.util.XmlUtils;
import org.junit.Test;


/**
 * @author AJ
 * 工厂模式
 */
public class FactoryTest {

    @Test
    public void testFactory() {
        LoggerFactory factory;
        Logger logger;
        //getBean()的返回类型为Object，需要进行强制类型转换
        factory = (LoggerFactory) XmlUtils.getBean("factoryBean");
        logger = factory.createLogger();
        logger.writeLog();
    }
}

