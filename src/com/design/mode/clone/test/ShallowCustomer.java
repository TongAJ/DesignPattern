package com.design.mode.clone.test;

import java.io.Serializable;

/**
 * 描述:
 * 客户类
 *
 * @author Administrator
 * @create 2018-09-18 13:36
 */
public class ShallowCustomer implements Serializable,Cloneable {
    private String name;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ShallowCustomer{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    protected ShallowCustomer clone() throws CloneNotSupportedException {
        return (ShallowCustomer)super.clone();
    }
}
