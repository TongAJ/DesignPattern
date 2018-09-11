package com.design.mode.factory;

import com.design.mode.util.XmlUtils;
import org.jetbrains.annotations.NotNull;

/**
 * 定义抽象层Chart
 */
interface Chart{
    /**
     * 业务方法
     */
    void display();
}

/**
 * Chart的具体实现 LineChart
 */
class LineChart implements Chart {

    LineChart(){
        System.out.println("LineChart init...");
    }

    @Override
    public void display() {
        System.out.println("LineChart display...");
    }
}
/**
 * Chart的具体实现 PieChart
 */
class PieChart implements Chart{

    PieChart(){
        System.out.println("PieChart init...");
    }

    @Override
    public void display() {
        System.out.println("PieChart display...");
    }
}
/**
 * Chart的具体实现 HistogramChart
 */
class HistogramChart implements Chart{

    HistogramChart(){
        System.out.println("HistogramChart init...");
    }

    @Override
    public void display() {
        System.out.println("HistogramChart display...");
    }
}

/**
 * 简单工厂模式：ChartFactory
 */
class ChartFactory{

    private static final String HISTOGRAM = "histogram";
    private static final String PIE = "pie";
    private static final String LINE = "line";

    static Chart getChart(@NotNull String type){
        Chart chart = null;
        if (HISTOGRAM.equalsIgnoreCase(type)) {
            chart = new HistogramChart();
        }
        else if (PIE.equalsIgnoreCase(type)) {
            chart = new PieChart();
        }
        else if (LINE.equalsIgnoreCase(type)) {
            chart = new LineChart();
        }
        return chart;
    }
}

/**
 * 简化之后的简单工厂，将生产具体对象得方法写实现
 */
class SimpleChartFactory{

    static Chart getChart(){
        String chartType = XmlUtils.getType("chartType");
        return ChartFactory.getChart(chartType);
    }
}

/**
 * 01版本的代码没有遵循开闭原则，即每次Client需要更换类型时都要修改代码
 */
class Client01 {
    public static void main(String[] args) {
        Chart chart = ChartFactory.getChart("pie");
        chart.display();
    }
}

/**
 * 02版本采用通过读取xml配置文件中的类型，给Client传递参数
 */
class Client02 {
    public static void main(String[] args) {
        String chartType = XmlUtils.getType("chartType");
        Chart chart = ChartFactory.getChart(chartType);
        chart.display();
    }
}

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
public class SimpleStaticFactory {
    public static void main(String[] args) {
        // 03版本，在02版本的基础上，简化简单工厂后
        // 只需要通过Factory直接获取Chart具体对象即可
        Chart chart = SimpleChartFactory.getChart();
        chart.display();

    }
}
