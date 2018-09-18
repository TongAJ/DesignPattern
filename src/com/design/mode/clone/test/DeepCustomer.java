package com.design.mode.clone.test;

import java.io.*;

/**
 * 描述:
 * 客户类
 *
 * @author Administrator
 * @create 2018-09-18 13:36
 */
public class DeepCustomer implements Serializable,Cloneable {
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
        return "DeepCustomer{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    protected DeepCustomer clone() throws CloneNotSupportedException {
        DeepCustomer object = null;
        try{
            ByteArrayOutputStream byteArrayOutputStream =
                    new ByteArrayOutputStream();
            ObjectOutputStream outputStream =
                    new ObjectOutputStream(byteArrayOutputStream);
            outputStream.writeObject(this);

            ByteArrayInputStream byteArrayInputStream =
                    new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream inputStream =
                    new ObjectInputStream(byteArrayInputStream);
            object = (DeepCustomer) inputStream.readObject();
        } catch (Exception e){
            e.printStackTrace();
        }
        return object;
    }
}
