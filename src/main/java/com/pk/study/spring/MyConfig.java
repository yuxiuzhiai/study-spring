package com.pk.study.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author pengkai
 * @date 2019-12-11
 */
@Configuration
public class MyConfig {

    @Bean(name = "/foo")
    public String bean(){
        return "foo";
    }
}
