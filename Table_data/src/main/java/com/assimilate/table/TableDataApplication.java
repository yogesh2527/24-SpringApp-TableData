package com.assimilate.table;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
@Configuration
@EnableTransactionManagement
public class TableDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(TableDataApplication.class, args);
	}

}
