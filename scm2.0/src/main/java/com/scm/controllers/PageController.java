package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home Page Handler");
        model.addAttribute("name", "Substring Techmologies");
        model.addAttribute("youTube", "LearnCodeWIthDhiraj");
        model.addAttribute("gitRepo", "https://github.com/DhirajETRX");
        return "home";
    }


    // About 
    @RequestMapping("/about")
    public String aboutPage(Model model){
        model.addAttribute("isLogin", true);
        System.out.println("About page is loading");
        return "about";
    }

    // Services
    @RequestMapping("/services")
    public String servicePage(){
        System.out.println("Sevices page is loading");
        return "services";
    }

    //contact
    @GetMapping("/contact")
    public String contact(){
        return new String("contact");
    }


    //login
    @GetMapping("/login")
    public String login(){
        return new String("login");
    }


    //signup
    @GetMapping("/signup")
    public String signup(){
        return new String("register");
    }
}
