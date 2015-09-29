package com.twu.biblioteca.library;

import com.twu.biblioteca.user.User;

import java.util.HashMap;

/**
 * Created by zhenliu on 9/29/15.
 */
public class UserDB {
    public static HashMap<String, User> userHashMap = new HashMap<String, User>(){
        {
            put("001-user", new User("Jean Liu","Chengdu","13096323000"));
            put("002-user", new User("John Lin","Chengdu","18675503000"));
        }
    };
}
