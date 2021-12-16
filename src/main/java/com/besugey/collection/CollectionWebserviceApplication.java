/*****************************************************************************
 * Copyright 2021 Besugey
 ****************************************************************************/
package com.besugey.collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySource("classpath:application-dev.properties")
public class CollectionWebserviceApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/besugey");
		SpringApplication.run(CollectionWebserviceApplication.class, args);
	}

}
