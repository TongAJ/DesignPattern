package com.design.mode.decoration.password;

import org.junit.Test;

/**
 * 描述:
 * 测试类
 *
 * @author Administrator
 * @create 2018-10-08 17:48
 */
public class PasswordTest {
    @Test
    public void testPassword(){
        Password password,passwordLevelOne,passwordLevelTwo;
        password = new ConceratePassword();
        passwordLevelOne = new LevelOnePassword(password);
        passwordLevelTwo = new LevelTwoPassword(passwordLevelOne);
        passwordLevelTwo.setPasswordLevel();
    }
}
