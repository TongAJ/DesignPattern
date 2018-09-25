package com.design.mode.adaptee.score;

import org.junit.Test;

/**
 * 描述:
 * 测试类
 *
 * @author Administrator
 * @create 2018-09-20 16:46
 */
public class ScoreOperationTest {

    @Test
    public void testOperation(){
        ScoreOperation operation = new OperationAdapter();
        //定义成绩数组
        int[] scores = {84,76,50,69,90,91,88,96};
        int[] result;
        int score;
        System.out.println("成绩排序结果：");
        result = operation.sort(scores);
        //遍历输出成绩
        for(int i : scores) {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println("查找成绩90：");
        score = operation.search(result,90);
        if (score != -1) {
            System.out.println("找到成绩90。");
        }
        else {
            System.out.println("没有找到成绩90。");
        }
        System.out.println("查找成绩92：");
        score = operation.search(result,92);
        if (score != -1) {
            System.out.println("找到成绩92。");
        }
        else {
            System.out.println("没有找到成绩92。");
        }
    }
}
