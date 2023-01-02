package com.example.githubproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
6
 */
@RequestMapping("/user")
@Controller
public class ControllerA {

    @RequestMapping("/findall")
    public String findall(){
        System.out.println("findall invoke");
        System.out.println("66666666");
        return "findallpage";
    }

}
