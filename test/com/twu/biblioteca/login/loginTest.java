package com.twu.biblioteca.login;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;


/**
 * Created by zhenliu on 9/29/15.
 */
public class loginTest {
    @Test
    public void shouldLoginSuccessfullyWhenUserNameAndPassWordIsCorrect() throws Exception {
        assertTrue(Login.userLogin("001-user", "123456"));
    }
}