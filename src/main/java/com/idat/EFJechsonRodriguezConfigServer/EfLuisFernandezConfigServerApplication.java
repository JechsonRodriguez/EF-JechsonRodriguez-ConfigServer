package com.idat.EFJechsonRodriguezConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class EfJechsonRodriguezConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfJechsonRodriguezConfigServerApplication.class, args);
	}

}
