package com.example.demo;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApplicationBApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationBApplication.class, args);
	}

}
