package com.design.mode.beans.chart.impl;

import com.design.mode.beans.chart.Chart;

/**
 * @author AJ
 * Chart的具体实现 HistogramChart
 */
public class HistogramChart implements Chart {

    public HistogramChart(){
        System.out.println("HistogramChart init...");
    }

    @Override
    public void display() {
        System.out.println("HistogramChart display...");
    }
}
