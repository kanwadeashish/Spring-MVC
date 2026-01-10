package com.xworkz.bikeDetails.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BikeInitialization extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("This is getRootConfigClasses");
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("This is getServletConfigClasses");
        return new Class[]{BikeConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("This is getServletMappings");
        return new String[]{"/"};
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer defaultServletHandlerConfigurer){
        defaultServletHandlerConfigurer.enable();
    }
}
