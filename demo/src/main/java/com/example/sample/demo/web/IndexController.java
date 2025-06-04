package com.example.sample.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @GetMapping
    @ResponseBody
    public String index() {
<<<<<<< HEAD
        return "<h1>hello3</h1>";
=======
        return "<h1>hello1</h1>";
>>>>>>> be8c75448e3f2d648b6be3409b6aa4c18ac21e40
    }
}