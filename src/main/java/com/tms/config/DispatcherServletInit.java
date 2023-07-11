package com.tms.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    /** Классы, которые поднимают нужные нам бины */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    /** Класс с настройками (наш viewResolver) */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    /** На какие url отвечаем */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
