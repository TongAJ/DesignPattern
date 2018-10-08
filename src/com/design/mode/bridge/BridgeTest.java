package com.design.mode.bridge;

import org.junit.Test;

/**
 * 描述:
 * 桥链接模式测试类
 *
 * @author Administrator
 * @create 2018-10-08 10:27
 */
public class BridgeTest {

    @Test
    public void testBridgeMode(){
        //这里的 file/fileFormatter 可以通过xml配置方式进行配置
        AbstractFile file = new OracleFile();
        FileFormatter fileFormatter = new PdfFormatter();
        file.setFileFormatter(fileFormatter);
        file.setDB();
    }
}
