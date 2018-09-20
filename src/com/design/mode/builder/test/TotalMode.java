package com.design.mode.builder.test;

/**
 * 描述:
 * 播放模式：完整模式
 *
 * @author Administrator
 * @create 2018-09-20 10:28
 */
public class TotalMode extends AbstractPlayMode {

    @Override
    public void buildMenu() {
        videoPlayer.setMenu("完整模式：显示菜单");
    }

    @Override
    public void buildPlayList() {
        videoPlayer.setPlayList("完整模式：显示播放列表");
    }

    @Override
    public void buildMainFront() {
        videoPlayer.setMainFront("完整模式：显示主窗口");
    }

    @Override
    public void buildControlBar() {
        videoPlayer.setControlBar("完整模式：显示控制条");
    }

    @Override
    public void buildCollections() {
        videoPlayer.setCollections("完整模式：显示收藏列表");
    }
}
