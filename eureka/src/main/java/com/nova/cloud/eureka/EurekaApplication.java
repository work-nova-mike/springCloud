package com.nova.cloud.eureka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
	
	@Value(value="${message.welcome}")
	private static String mensaje;

	public static void main(String[] args) {
		System.out.println("<<<<<<<<<<<<<<<<<<<< Mensaje de Prueba >>>>>>>>>>>>>>>>>");
		System.out.println(mensaje);
		SpringApplication.run(EurekaApplication.class, args);
	}

}
