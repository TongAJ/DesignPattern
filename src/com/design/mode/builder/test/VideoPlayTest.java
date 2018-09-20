package com.design.mode.builder.test;

import org.junit.Test;

/**
 * 描述:
 * 视频播放测试
 *
 * @author Administrator
 * @create 2018-09-20 10:43
 */
public class VideoPlayTest {

    @Test
    public void testPlayController(){
        AbstractPlayMode playMode = new MemoryMode();
        VideoPlayer videoPlayer = VideoPlayController.construct(playMode);
        System.out.println("videoPlayer = " + videoPlayer);
    }
}
