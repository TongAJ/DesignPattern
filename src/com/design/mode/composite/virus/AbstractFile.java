package com.design.mode.composite.virus;

/**
 * 描述:
 * 抽象类：抽象构件
 *
 * @author Administrator
 * @create 2018-10-08 16:03
 */
public abstract class AbstractFile {

    /**
     * Add
     * @param file
     */
    public abstract void add(AbstractFile file);

    /**
     * Remove
     * @param file
     */
    public abstract void remove(AbstractFile file);

    /**
     * Get File
     * @param i
     * @return AbstractFile
     */
    public abstract AbstractFile getChild(int i);

    /**
     * Kill Virus
     */
    public abstract void killVirus();
}
