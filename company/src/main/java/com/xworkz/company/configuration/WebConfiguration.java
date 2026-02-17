package com.xworkz.company.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.company")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("WebConfiguration is Called");
    }

    @Bean
    public ViewResolver viewResolver(){
        System.out.println("viewResolver is Called");
        return new InternalResourceViewResolver("/",".jsp");
    }
}
