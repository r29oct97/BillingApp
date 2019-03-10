package com.cg.billing.BillingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cg")
@EntityScan("com.cg.bean")
public class BillingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingAppApplication.class, args);
	}

}
