package com.klu.agri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.klu.agri.entity.ContactUs;
import com.klu.agri.entity.ContactUs;
import com.klu.agri.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/")
    @Secured("USER")
    public String home(){
        return "home";
    }
    @RequestMapping("/docontactus")
   
    public String contactus(@ModelAttribute("contactUs") ContactUs contactUs){
        userService.insertcontactus(contactUs);
        return "contactus"; 
    }
    @RequestMapping("/product")
    public String product(){
        return "product";
    }
}
