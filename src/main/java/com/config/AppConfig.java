package com.config;

import com.App;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by  waiter on 18-11-17  下午2:22.
 *
 * @author waiter
 */
@Configuration
@ComponentScan(basePackageClasses = App.class,
        excludeFilters = { @ComponentScan.Filter(type= FilterType.ANNOTATION,value= EnableWebMvc.class)})
public class AppConfig {

}
