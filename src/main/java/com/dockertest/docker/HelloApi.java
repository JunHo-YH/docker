package com.dockertest.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {
    @GetMapping("/")
    public String hello() {
        return "hello";
    }
}
