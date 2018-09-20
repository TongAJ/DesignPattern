package com.design.mode.builder.test;

/**
 * 描述:
 * 视频播放器
 *
 * @author Administrator
 * @create 2018-09-20 10:22
 */
public class VideoPlayer {

    private String menu;
    private String playList;
    private String mainFront;
    private String controlBar;
    private String collections;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getPlayList() {
        return playList;
    }

    public void setPlayList(String playList) {
        this.playList = playList;
    }

    public String getMainFront() {
        return mainFront;
    }

    public void setMainFront(String mainFront) {
        this.mainFront = mainFront;
    }

    public String getControlBar() {
        return controlBar;
    }

    public void setControlBar(String controlBar) {
        this.controlBar = controlBar;
    }

    public String getCollections() {
        return collections;
    }

    public void setCollections(String collections) {
        this.collections = collections;
    }

    @Override
    public String toString() {
        return "VideoPlayer{" +
                "menu='" + menu + '\'' +
                ", playList='" + playList + '\'' +
                ", mainFront='" + mainFront + '\'' +
                ", controlBar='" + controlBar + '\'' +
                ", collections='" + collections + '\'' +
                '}';
    }
}
