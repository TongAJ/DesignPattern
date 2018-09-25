package com.design.mode.adaptee.score;

/**
 * 描述:
 * 成绩查询适配器
 *
 * @author Administrator
 * @create 2018-09-20 11:33
 */
public class OperationAdapter implements ScoreOperation {

    /**
     * Two adaptee
     */
    private QuickSort quickSort;
    private BinarySearch binarySearch;

    public OperationAdapter(){
        quickSort = new QuickSort();
        binarySearch = new BinarySearch();
    }

    @Override
    public int[] sort(int[] arr) {
        return quickSort.quickSort(arr);
    }

    @Override
    public int search(int[] arr, int number) {
        return binarySearch.binarySearch(arr,number);
    }
}
