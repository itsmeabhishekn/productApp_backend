package com.example.productApp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {

    @GetMapping("/")
    public String home()
    {
        return "this is home";
    }

    @PostMapping("/search")
    public String search()
    {
        return "this is search page";
    }

    @PostMapping("/edit")
    public String edit()
    {
        return "this is edit page ";
    }

    @GetMapping("/viewall")
    public String view()
    {
        return "this is viewall page";
    }

    @PostMapping("/delete")
    public String delete()
    {
        return "this is delete page";
    }

}
