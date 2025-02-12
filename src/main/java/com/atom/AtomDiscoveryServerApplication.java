package com.atom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AtomDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtomDiscoveryServerApplication.class, args);
	}

}
