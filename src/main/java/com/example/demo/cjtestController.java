package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class cjtestController {
    @RequestMapping(value = "get",method = RequestMethod.GET)
    String hello() {

        return "hello world";
    }
}
