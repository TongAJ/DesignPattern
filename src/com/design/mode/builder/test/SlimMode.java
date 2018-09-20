package com.design.mode.builder.test;

/**
 * 描述:
 * 播放模式：精简模式
 *
 * @author Administrator
 * @create 2018-09-20 10:28
 */
public class SlimMode extends AbstractPlayMode {

    @Override
    public void buildMenu() {
        videoPlayer.setMenu("精简模式：不显示菜单");
    }

    @Override
    public void buildPlayList() {
        videoPlayer.setPlayList("精简模式：不显示播放列表");
    }

    @Override
    public void buildMainFront() {
        videoPlayer.setMainFront("精简模式：显示主窗口");
    }

    @Override
    public void buildControlBar() {
        videoPlayer.setControlBar("精简模式：显示控制条");
    }

    @Override
    public void buildCollections() {
        videoPlayer.setCollections("精简模式：不显示收藏列表");
    }

}
