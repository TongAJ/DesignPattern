package com.design.mode.composite.virus;

import java.util.ArrayList;

/**
 * 描述:
 * 容器构件
 *
 * @author Administrator
 * @create 2018-10-08 16:26
 */
public class Folder extends AbstractFile {
    ArrayList<AbstractFile> fileList = new ArrayList<>();
    String name;

    public Folder(String name){
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("对文件夹‘"+name+"’进行杀毒");
        fileList.forEach(AbstractFile::killVirus);
    }
}
