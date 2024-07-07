package com.stream.learnspringboot.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class InputDAO
{
    private static final Logger log = LoggerFactory.getLogger(InputDAO.class);

    public void input(String input)
    {
        log.info("Input to database: {}", input);
    }
}
