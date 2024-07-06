package com.stream.springboottest2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @RequestMapping("/hello")
    public String hello()
    {
        System.out.println("Ciallo~");
        return "Ciallo~";
    }
}
