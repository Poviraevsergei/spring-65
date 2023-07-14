package com.tms.config;

import com.tms.interseptor.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@EnableAspectJAutoProxy //активирует АОП
@ComponentScan("com.tms") //с какой папки начинать вычитывать все классы
@Configuration //которые будут использоваться для настройки, где мы будуем создавать свои бины
public class SpringConfig implements WebMvcConfigurer {

    private MyInterceptor myInterceptor;

    public SpringConfig(MyInterceptor myInterceptor) {
        this.myInterceptor = myInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor).addPathPatterns("/main-path/**");
    }

    @Bean
    public InternalResourceViewResolver viewResolverInit(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}