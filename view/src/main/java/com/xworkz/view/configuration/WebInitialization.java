package com.xworkz.view.configuration;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Component
public class WebInitialization extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

    public WebInitialization(){
        System.out.println("WebInitialization.....");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("This is getRootConfigClasses");
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("This is getServletConfigClasses");
        return new Class[]{WebConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("This is getServletMappings");
        return new String[]{"/"};
    }

    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        System.out.println("This is configureDefaultServletHandling");
        configurer.enable();
    }
}
