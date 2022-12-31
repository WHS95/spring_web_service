package com.web_service.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//컨트롤러를 JSON을 반환하는 컨트롤러로 만들어준다.
//예전에 @ResponseBody를 각메소드마다 선언했던것을 한번에 사용할 수 있게 해준다.
public class HelloController {
    @GetMapping("/hello")
    //@GetMapping HTTP Method인 Get요청을 받을수있는 API를 만들어 준다.
    public String hello(){
        return "hello";
    }
}
