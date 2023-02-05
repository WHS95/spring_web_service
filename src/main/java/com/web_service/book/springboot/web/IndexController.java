package com.web_service.book.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return  "index";//index.mustache 호출
    }

    @GetMapping("/post/save")
    public String postsSave(){
        return "posts-save";//posts-save.mustache 호출
    }
}
