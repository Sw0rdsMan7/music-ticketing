/**
 * Created by IntelliJ IDEA.
 * User: 殷俊
 * Date: 2024/4/22
 * Time: 21:17
 * To change this template use File | Settings | File Templates.
 */
package com.hznu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.hznu.pojo.User;

//RestController Controller下所有的方法返回值都为json
@Controller
public class UserController {

    //登录 login.do?username=xxx&password=xxx
    @RequestMapping(value = "/login.do")
    @ResponseBody
    public User login(@RequestParam(value = "username",required = true,defaultValue = "") String username,
                      @RequestParam(value = "password",required = true) String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setId(1);



        return user;
    }
}
