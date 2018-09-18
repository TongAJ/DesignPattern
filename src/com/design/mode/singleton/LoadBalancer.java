package com.design.mode.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 描述:
 * 负载均衡器LoadBalancer：单例类，真实环境下该类将非常复杂，包括大量初始化的工作和业务方法，
 * 考虑到代 码的可读性和易理解性，只列出部分与模式相关的核心代码
 *
 * @author Administrator
 * @create 2018-09-14 16:33
 */
public class LoadBalancer {
    private static LoadBalancer loadBalancer = null;
    private List serverList = null;

    private LoadBalancer(){
        serverList =  new ArrayList<>();
    }

    public static LoadBalancer newInstance(){
        if (loadBalancer == null) {
            loadBalancer = new LoadBalancer();
        }
        return loadBalancer;
    }

    public void addServer(String server){
        serverList.add(server);
    }

    public void removeServer(String server){
        serverList.remove(server);
    }

    /**
     * 使用Random类随机获取服务器
     */
    public String getServer() {
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String)serverList.get(i);
    }
}
