package com.twu.biblioteca.login;

import java.util.HashMap;

/**
 * Created by zhenliu on 9/29/15.
 */
public class Login {
    public static HashMap<String,String> userDB = new HashMap<String,String>(){
        {
            put("001-user","123456");
            put("002-user","654321");
        }
    };

    public static boolean userLogin(String userName, String userPassword){
       if(userDB.get(userName).equals(userPassword)){
           return true;
       }else{
           System.out.println("User Name or Password is Wrong!");
           return false;
       }
    }
}
