package com.design.mode.simplefactory.beans.chart.impl;

import com.design.mode.simplefactory.beans.chart.Chart;

/**
 * @author AJ
 * Chart的具体实现 PieChart
 */
public class PieChart implements Chart {

    public PieChart(){
        System.out.println("PieChart init...");
    }

    @Override
    public void display() {
        System.out.println("PieChart display...");
    }
}
