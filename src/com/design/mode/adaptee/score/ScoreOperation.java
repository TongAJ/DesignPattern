package com.design.mode.adaptee.score;

/**
 * 描述:
 * 成绩查询接口
 *
 * @author Administrator
 * @create 2018-09-20 11:30
 */
public interface ScoreOperation {

    /**
     * 对int[]的数组排序
     * @param arr
     * @return
     */
    public int[] sort(int[] arr);

    /**
     * 在数组中查询某个数字
     * @param arr
     * @param number
     * @return
     */
    public int search(int[] arr, int number);
}
