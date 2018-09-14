package com.design.mode.simplefactory;

import com.design.mode.simplefactory.beans.chart.Chart;
import com.design.mode.simplefactory.beans.chart.impl.HistogramChart;
import com.design.mode.simplefactory.beans.chart.impl.LineChart;
import com.design.mode.simplefactory.beans.chart.impl.PieChart;
import com.design.util.XmlUtils;
import org.jetbrains.annotations.NotNull;

/**
 * @author AJ
 * 简单工厂模式：ChartFactory
 */
public class ChartFactory{

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

    public static Chart getChart(){
        String chartType = XmlUtils.getType("chartType");
        return getChart(chartType);
    }

}
