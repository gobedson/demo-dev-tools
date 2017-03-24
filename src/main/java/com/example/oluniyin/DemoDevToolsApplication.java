package com.example.oluniyin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.oluniyin.services.User;

@ComponentScan("com.example.oluniyin")
@SpringBootApplication
public class DemoDevToolsApplication {

	@Bean
	public User user(){
		return new User ("Godson","Yebadokpo");
	}
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoDevToolsApplication.class, args);

		String[] beanNames = ctx.getBeanDefinitionNames();
		
		System.err.println("List of beans ");
		for(String name: beanNames){
			System.out.println(name);
		}
		
		System.out.println(ctx.getBean("user").toString());
	}
}
