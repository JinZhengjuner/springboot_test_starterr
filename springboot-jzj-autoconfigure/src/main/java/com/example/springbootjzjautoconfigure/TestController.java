package com.example.springbootjzjautoconfigure;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public String index(){
        return "儿子.. success";
    }

}
