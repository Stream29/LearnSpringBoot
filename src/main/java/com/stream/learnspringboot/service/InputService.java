package com.stream.learnspringboot.service;

import com.stream.learnspringboot.dao.InputDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InputService
{
    private static final Logger log = LoggerFactory.getLogger(InputService.class);
    @Autowired
    private InputDAO inputDAO;
    public void input(String input)
    {
        log.info("Input received: {}", input);
        inputDAO.input(input);
    }
}
