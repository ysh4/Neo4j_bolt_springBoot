package com.spring;

import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.GraphDatabase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.neo4j.driver.v1.Driver;

@SpringBootApplication
public class GraphApplication {


	public static void main(String[] args) {
		SpringApplication.run(GraphApplication.class, args);

	}

}
