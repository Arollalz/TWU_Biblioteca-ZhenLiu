package com.twu.biblioteca.user;

import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by zhenliu on 9/29/15.
 */
public class userTest {
    @Test
    public void shouldNewUserSuccessfullyWhenNewAUser() throws Exception {
        User user = new User("001-user","Chengdu","13096323000");

        assertNotNull(user.getName());
        assertNotNull(user.getAddress());
        assertNotNull(user.getPhoneNumber());
    }
}