package com.klu.agri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.klu.agri.entity.User;
import com.klu.agri.service.UserService;


@Controller

public class HomeController {

    @Autowired
    private UserService userService;
   
    @RequestMapping("/")
    public String dashboard(){
        return "index";
    }
    @RequestMapping("/about")
    public String about(){
        return "about";
    }
    @RequestMapping("/register")
    public String signup(){
        return "register";
    }
    @RequestMapping("/doregister")
    public String register(@ModelAttribute("user") User user){
        user.setRole("ROLE");
        userService.insertUser(user);
        return "index";
    }
    
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
