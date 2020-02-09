package com.pk.study.spring;

import com.pk.study.spring.servlet.MyAnotherServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengkai
 * @date 2019-12-11
 */
@Configuration
public class MyConfig {

//    @Bean(name = "/foo")
//    public UserInfo userInfo(){
//        UserInfo userInfo = new UserInfo();
//        userInfo.setA("a");
//        userInfo.setB("b");
//        return userInfo;
//    }
    @Bean
    public ServletRegistrationBean<MyAnotherServlet> myAnotherServletServletRegistrationBean(){
        ServletRegistrationBean<MyAnotherServlet> bean = new ServletRegistrationBean<>();
        bean.setServlet(new MyAnotherServlet());
        List<String> urlMappings = new ArrayList<>();
        urlMappings.add("/myAnotherServlet");
        bean.setUrlMappings(urlMappings);

        return bean;
    }
}
