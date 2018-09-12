package com.design.mode.beans.chart.impl;

import com.design.mode.beans.chart.Chart;

/**
 * @author AJ
 * Chart的具体实现 LineChart
 */
public class LineChart implements Chart {

    public LineChart(){
        System.out.println("LineChart init...");
    }

    @Override
    public void display() {
        System.out.println("LineChart display...");
    }
}
