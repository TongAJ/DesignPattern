package com.design.mode.decoration.password;

/**
 * 描述:
 * 一级加密
 *
 * @author Administrator
 * @create 2018-10-08 17:44
 */
public class LevelOnePassword extends PasswordDecorator {

    public LevelOnePassword(Password password) {
        super(password);
    }

    @Override
    public void setPasswordLevel() {
        super.setPasswordLevel();
        setLevelOne();
    }

    private void setLevelOne() {
        System.out.println("一级加密");
    }


}
