package com.weichuang.controller;

import com.weichuang.pojo.User;
import com.weichuang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/index.do")
    public String index(){
        return "index";
    }

    @RequestMapping("/register.do")
    public String register(){
        return "register";
    }

    @RequestMapping("/login.do")
    public String login(){
        return "login";
    }
    @RequestMapping("/registerUser")
    public String registerUser(User user){
        userService.registerUser(user);

        return "login";
    }

    @RequestMapping("/userLogin")
    public String userLogin(String username , String password , HttpSession session){
        User user = userService.userLogin(username , password);
        if(null != user){
            System.out.println(user);
            session.setAttribute("username" , user.getUsername());
        }
        return "index";
    }

}
