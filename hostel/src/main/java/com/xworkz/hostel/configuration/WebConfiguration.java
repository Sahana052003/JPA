package com.xworkz.hostel.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.swing.text.View;

@Configuration
@ComponentScan("com.xworkz.hostel")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("WebConfiguration is Called");
    }

    @Bean
    public ViewResolver viewResolver(){
        return new InternalResourceViewResolver("",".jsp");
    }
}
