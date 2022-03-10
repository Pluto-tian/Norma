package com.pluto.pluto_springboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Hoaer
 * @version 1.0
 */
@Configuration
public class MvcConfiguration implements WebMvcConfigurer{
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/main.html").setViewName("dashboard");
   }

   @Bean
   public LocaleResolver localeResolver(){
        return new Locale_Resolver();
    }


   @Override
   public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(new LoginHandlerInterceptor())
               .addPathPatterns("/**")
               .excludePathPatterns("/index.heml","/","/login","css/**","js/**","img/**");
   }
}
