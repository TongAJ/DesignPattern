package com.design.mode.builder.test;

/**
 * 描述:
 * 播放模式：记忆模式
 *
 * @author Administrator
 * @create 2018-09-20 10:28
 */
public class MemoryMode extends AbstractPlayMode {

    @Override
    public void buildMenu() {
        videoPlayer.setMenu("记忆模式：不显示菜单");
    }

    @Override
    public void buildPlayList() {
        videoPlayer.setPlayList("记忆模式：不显示播放列表");
    }

    @Override
    public void buildMainFront() {
        videoPlayer.setMainFront("记忆模式：显示主窗口");
    }

    @Override
    public void buildControlBar() {
        videoPlayer.setControlBar("记忆模式：显示控制条");
    }

    @Override
    public void buildCollections() {
        videoPlayer.setCollections("记忆模式：显示收藏列表");
    }
}
