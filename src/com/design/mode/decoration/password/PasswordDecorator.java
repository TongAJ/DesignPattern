package com.design.mode.decoration.password;

/**
 * 描述:
 * 抽象类：密码装饰类
 *
 * @author Administrator
 * @create 2018-10-08 17:50
 */
public abstract class PasswordDecorator extends Password {
    private Password password;

    public PasswordDecorator(Password password){
        this.password = password;
    }

    @Override
    public void setPasswordLevel() {
        password.setPasswordLevel();
    }
}
