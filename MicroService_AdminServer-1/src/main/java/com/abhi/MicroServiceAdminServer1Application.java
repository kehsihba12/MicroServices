package com.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class MicroServiceAdminServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceAdminServer1Application.class, args);
	}

}
