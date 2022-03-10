package com.pluto.pluto_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @author Hoaer
 * @version 1.0
 */
@Controller
public class IndexController {
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession Session,
                        Model model) {
        if (!(username == null) && password.equals("123456")) {
            Session.setAttribute("login",username);
            return "redirect:main.html";
        } else {
            model.addAttribute("message", "ERROR Incorrect username or password");
            return "index";
        }
    }
}