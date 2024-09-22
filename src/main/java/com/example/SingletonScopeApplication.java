package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.HelloService;
import com.example.configuration.ConfigFile;

@SpringBootApplication
public class SingletonScopeApplication {

	public static void main(String[] args) {
		
ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
		
        HelloService helloService1 = context.getBean(HelloService.class);
        HelloService helloService2 = context.getBean(HelloService.class);
        HelloService helloService3 = context.getBean(HelloService.class);
        System.out.println(helloService1);
        System.out.println(helloService2);
        System.out.println(helloService3);
		SpringApplication.run(SingletonScopeApplication.class, args);
	}

}
