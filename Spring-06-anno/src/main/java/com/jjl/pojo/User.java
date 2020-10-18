package com.jjl.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//等价于我们在bena里面配置了<bean id="user" class="com.jjl.pojo.User"/>
@Component
public class User {
    @Value("ljj")
    private  String name;

    public String getName() {
        return name;
    }
}
