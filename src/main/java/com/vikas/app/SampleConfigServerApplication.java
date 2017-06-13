package com.vikas.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SampleConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleConfigServerApplication.class, args);
	}
}
