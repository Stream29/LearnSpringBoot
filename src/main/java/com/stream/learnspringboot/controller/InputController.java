package com.stream.learnspringboot.controller;

import com.stream.learnspringboot.service.InputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InputController
{
    @Autowired InputService inputService;
    @RequestMapping("/input")
    public String input(String input)
    {
        inputService.input(input);
        return input;
    }
}
