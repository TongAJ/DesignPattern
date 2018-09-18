package com.design.mode.clone.test;

import java.io.Serializable;

/**
 * 描述:
 * 客户地址
 *
 * @author Administrator
 * @create 2018-09-18 13:35
 */
public class Address implements Serializable {
    private String road;
    private String zipCode;

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "road='" + road + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
