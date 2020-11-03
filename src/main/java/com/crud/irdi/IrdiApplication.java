package com.crud.irdi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;


@SpringBootApplication
public class IrdiApplication extends SpringBootServletInitializer
implements WebApplicationInitializer{

	public static void main(String[] args) {
		SpringApplication.run(IrdiApplication.class, args);
	}


}
