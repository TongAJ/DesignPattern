package com.design.mode.singleton;

import org.junit.Test;

/**
 * 描述:
 * 测试类
 *
 * @author Administrator
 * @create 2018-09-18 9:33
 */
public class SingletonTest {

    @Test
    public void testSingleton() {
        LoadBalancer balancer1 = LoadBalancer.newInstance();
        LoadBalancer balancer2 = LoadBalancer.newInstance();
        LoadBalancer balancer3 = LoadBalancer.newInstance();
        LoadBalancer balancer4 = LoadBalancer.newInstance();
        //判断服务器负载均衡器是否相同
        if (balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4
        ) {
            System.out.println("服务器负载均衡器具有唯一性！");
        }

        //增加服务器
        balancer1.addServer("Server 1");
        balancer1.addServer("Server 2");
        balancer1.addServer("Server 3");
        balancer1.addServer("Server 4");
        //模拟客户端请求的分发
        for (int i = 0; i < 10; i++) {
            String server = balancer1.getServer();
            System.out.println("分发请求至服务器： " + server);
        }
    }
}
