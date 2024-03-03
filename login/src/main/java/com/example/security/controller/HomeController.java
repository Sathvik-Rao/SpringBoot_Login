package com.example.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "home1";
    }

    @RequestMapping("/home2")
    @PreAuthorize("hasRole('ADMIN')") // only guests can access this page
    public String nextPage() {
        return "home2";
    }
}
