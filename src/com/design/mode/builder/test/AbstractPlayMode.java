package com.design.mode.builder.test;

/**
 * 描述:
 * 抽象类：播放模式
 *
 * @author Administrator
 * @create 2018-09-20 10:24
 */
public abstract class AbstractPlayMode {

    protected VideoPlayer videoPlayer = new VideoPlayer();

    /**
     * 设置：菜单
     */
    public abstract void buildMenu();
    /**
     * 设置：播放列表
     */
    public abstract void buildPlayList();
    /**
     * 设置：主界面
     */
    public abstract void buildMainFront();
    /**
     * 设置：控制条
     */
    public abstract void buildControlBar();
    /**
     * 设置：收藏列表
     */
    public abstract void buildCollections();

    public VideoPlayer getVideoPlayer(){
        return videoPlayer;
    }

}
