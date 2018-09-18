package com.design.mode.factory.simplefactory;

import com.design.mode.factory.simplefactory.beans.chart.Chart;
import com.design.util.XmlUtils;
import org.junit.Test;

/**
 * 简单工厂模式
 * 优点：
 *      1.直接生产具体产品
 *      2.通过配置文件获取
 * 缺点：
 *      1.责任过重，一点错误就全部瘫痪
 *      2.增加新的类型需要修改代码，违背开闭原则
 *      3.系统扩张同理
 *      4.简单工厂模式由于使用了静态工厂方法，造成工厂角色无法形成基于继承的等级结构
 * @author AJ
 */
public class SimpleFactoryTest {

    @Test
    public void testSimpleFactory() {

        //01版本的代码没有遵循开闭原则，即每次Client需要更换类型时都要修改代码
        Chart chart01 = ChartFactory.getChart("pie");
        chart01.display();

        //02版本采用通过读取xml配置文件中的类型，给Client传递参数
        String chartType = XmlUtils.getType("chartType");
        Chart chart02 = ChartFactory.getChart(chartType);
        chart02.display();

        // 03版本，在02版本的基础上，简化简单工厂后
        // 只需要通过Factory直接获取Chart具体对象即可
        Chart chart = ChartFactory.getChart();
        chart.display();
    }
}
