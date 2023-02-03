package com.web_service.book.springboot.web;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRegistration;

@Configuration
public class hibernateConfig {
    @Bean
    public ServletRegistrationBean h2servletRegistration(){
        ServletRegistrationBean registartion;
        registartion = new ServletRegistrationBean(new WebServlet());
        registartion.addUrlMappings("/console/*");
        return registartion;
    }
}
