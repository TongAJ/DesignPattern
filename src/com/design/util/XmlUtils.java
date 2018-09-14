package com.design.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @author AJ
 * 解析Xml中配置的属性
 */
public class XmlUtils {

    /**
     * 从Xml中获取chartType节点中的值
     * @return chartType
     */
    public static String getType(String type){
        try {
            // 定义返回变量
            String chartType="";
            // 调用 DocumentBuilderFactory.newInstance() 方法得到创建 DOM 解析器的工厂
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            // 调用工厂对象的 newDocumentBuilder方法得到 DOM 解析器对象
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            // 传入解析的 XML 文档,以便 DOM 解析器解析它
            Document document = builder.parse(new File("config.xml"));
            // 获取TagName是chartType的节点列表
            NodeList nodeList = document.getElementsByTagName(type);
            // 获取第一个子节点
            Node node = nodeList.item(0).getFirstChild();
            // 子节点内容
            chartType = node.getNodeValue().trim();
            // 返回chartType
            return chartType;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 通过读取配置文件，并反射获取需要配置的工厂类型
     * @return object
     */
    public static Object getBean(String beanNode) {
        try {
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document document = builder.parse(new File("config.xml"));
            NodeList nodeList = document.getElementsByTagName(beanNode);
            Node node = nodeList.item(0).getFirstChild();
            String className = node.getNodeValue().trim();
            Class clz = Class.forName(className);
            Object object = clz.newInstance();
            return object;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
