package com.docker.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String args[]){
        //dummy comment
        SpringApplication.run(Application.class);
        System.out.println("***Application Started***");
    }
}
