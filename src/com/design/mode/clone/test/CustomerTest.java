package com.design.mode.clone.test;

import org.junit.Test;

/**
 * 描述:
 * 客户测试类
 *
 * @author Administrator
 * @create 2018-09-18 14:27
 */
public class CustomerTest {

    @Test
    public void testShallowAndDeep(){
        Address address = new Address();
        address.setRoad("West Dalian Road");
        address.setZipCode("20080");

        ShallowCustomer shallowCustomer = new ShallowCustomer();
        shallowCustomer.setName("shallow");
        shallowCustomer.setAddress(address);

        try {
            ShallowCustomer shallowCopy = shallowCustomer.clone();
            System.out.println("Shallow Test：");
            System.out.println(shallowCustomer==shallowCopy);
            System.out.println(shallowCustomer.getAddress()==shallowCopy.getAddress());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        DeepCustomer deepCustomer = new DeepCustomer();
        deepCustomer.setName("shallow");
        deepCustomer.setAddress(address);

        try {
            DeepCustomer deepCopy = deepCustomer.clone();
            System.out.println("Deep Test：");
            System.out.println(deepCustomer==deepCopy);
            System.out.println(deepCustomer.getAddress()==deepCopy.getAddress());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
