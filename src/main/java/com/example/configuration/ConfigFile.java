package com.example.configuration;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.beans.HelloService;
import com.example.service.BookService;
import com.example.service.BookServiceImpl;

@Configuration
public class ConfigFile {
	
    @Bean
    public BookService bookService() {
        return new BookServiceImpl();
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public HelloService helloService() {
        return new HelloService(); // This will be managed by Spring
    }

}

