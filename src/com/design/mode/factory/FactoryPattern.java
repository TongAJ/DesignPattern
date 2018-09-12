package com.design.mode.factory;

import com.design.mode.beans.logger.Logger;
import com.design.mode.util.XmlUtils;


/**
 * @author AJ
 * 工厂模式
 */
public class FactoryPattern {
    public static void main(String args[]) {
        LoggerFactory factory;
        Logger logger;
        //getBean()的返回类型为Object，需要进行强制类型转换
        factory = (LoggerFactory) XmlUtils.getBean();
        logger = factory.createLogger();
        logger.writeLog();
    }
}

