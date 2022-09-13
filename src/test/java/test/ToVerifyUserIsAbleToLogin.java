package test;

import org.testng.annotations.Test;

public class ToVerifyUserIsAbleToLogin extends BaseTest {
    @Test
        public void loginUser(){
            pageFactory.getLoginPage().loginUser();
        }
    }
