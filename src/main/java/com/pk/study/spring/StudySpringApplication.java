package com.pk.study.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author pengkai
 * @date 2019-12-08
 */
@SpringBootApplication
public class StudySpringApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(StudySpringApplication.class);
        //可以在run之前,对AC进行一些自定义的配置,添加点ApplicationListener,ApplicationContextInitializer啥的
        ApplicationContext ac = springApplication.run(args);
        System.out.println(ac.getEnvironment());
    }
}
