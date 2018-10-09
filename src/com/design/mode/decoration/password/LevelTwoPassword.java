package com.design.mode.decoration.password;

/**
 * 描述:
 * 二级加密
 *
 * @author Administrator
 * @create 2018-10-08 17:47
 */
public class LevelTwoPassword extends PasswordDecorator {

    public LevelTwoPassword(Password password) {
        super(password);
    }

    @Override
    public void setPasswordLevel() {
        super.setPasswordLevel();
        setLevelTwo();
    }

    public void setLevelTwo(){
        System.out.println("二级加密");
    }
}
