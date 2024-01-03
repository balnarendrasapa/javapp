package com.javapp.javapp;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class commandline implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(commandline.class, args);
    }

    @Override
    public void run(final String... args) {
        log.info("Hello !");
    }
}
