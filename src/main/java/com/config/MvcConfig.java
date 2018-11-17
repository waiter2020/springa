package com.config;

/**
 * Created by  waiter on 18-11-17  下午2:24.
 *
 * @author waiter
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
//启动SpringMVC
@EnableWebMvc
//启动组件扫描
@ComponentScan("com.*")
public class MvcConfig implements WebMvcConfigurer {

    //配置JSP视图解析器
    @Bean
    public ViewResolver viewResolver() {

        InternalResourceViewResolver resolver = new InternalResourceViewResolver();

        resolver.setPrefix("/WEB-INF/");

        resolver.setSuffix(".jsp");

        resolver.setExposeContextBeansAsAttributes(true);

        return resolver;

    }


    /**
     *     配置静态资源的处理
     */
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

        configurer.enable(); //对静态资源的请求转发到容器缺省的servlet，而不使用DispatcherServlet

    }


}

