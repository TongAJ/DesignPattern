package com.design.mode.decoration.password;

/**
 * 描述:
 * 具体密码类
 *
 * @author Administrator
 * @create 2018-10-08 17:56
 */
public class ConceratePassword extends Password {

    @Override
    public void setPasswordLevel() {
        System.out.println("设置密码");
    }
}
