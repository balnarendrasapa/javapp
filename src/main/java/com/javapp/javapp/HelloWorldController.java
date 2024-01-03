package com.javapp.javapp;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class HelloWorldController implements CommandLineRunner {

    @GetMapping(path = "/hallowed")
    public String hello() {
        return "through rest!";
    }

    @Override
    public void run(String... args)  {
        log.info("Hello World! in controller");
    }
}