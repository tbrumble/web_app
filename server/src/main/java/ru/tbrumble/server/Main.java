package ru.tbrumble.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@ImportResource("classpath:beans.xml")
@EnableMongoRepositories
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
