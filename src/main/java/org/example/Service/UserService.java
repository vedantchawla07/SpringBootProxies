package org.example.Service;

import org.example.Bean.UserConfig;
import org.springframework.context.annotation.Lazy;


public class UserService {

    UserConfig userConfig;

    public UserService(UserConfig userConfig){
        System.out.println("Vedant 3");
          this.userConfig = userConfig;
    }


}
