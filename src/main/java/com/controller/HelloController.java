package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by  waiter on 18-11-17  下午2:30.
 *
 * @author waiter
 */
@Controller
public class HelloController {
    @RequestMapping(value = "/")
    public ModelAndView hello(ModelAndView modelAndView){
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
