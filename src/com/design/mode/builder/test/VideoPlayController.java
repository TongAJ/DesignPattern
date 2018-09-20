package com.design.mode.builder.test;

import sun.net.idn.Punycode;

/**
 * 描述:
 * 播放控制器
 *
 * @author Administrator
 * @create 2018-09-20 10:35
 */
public class VideoPlayController {

    public static VideoPlayer construct(AbstractPlayMode playMode){
        playMode.buildMenu();
        playMode.buildCollections();
        playMode.buildControlBar();
        playMode.buildMainFront();
        playMode.buildPlayList();
        return playMode.getVideoPlayer();
    }

}
