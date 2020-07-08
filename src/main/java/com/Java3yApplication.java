package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations= {"classpath*:spring.xml"})
public class Java3yApplication {

    public static void main(String[] args) {
        SpringApplication.run(Java3yApplication.class, args);
    }
}
