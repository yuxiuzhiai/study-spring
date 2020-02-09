package com.pk.study.spring.customer;

import com.pk.study.spring.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author pengkai
 * @date 2019/12/14
 */
public class CustomTest {

    @Test
    public void test(){
        //创建一个实现了BeanDefinitionRegistry的BeanFactory实现
        //DefaultListableBeanFactory也是绝大多数场景下，BeanFactory的具体实现
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //XmlBeanDefinitionReader创建，从名字可以看出来 这个类是用来从xml文件中读取配置的
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        //具体解析xml文件中的配置，并注册到BeanDefinitionRegistry中去
        reader.loadBeanDefinitions(new ClassPathResource("custom.xml"));

        CustomBean userInfo = beanFactory.getBean(CustomBean.class);
        System.out.println(userInfo.getName());
    }
}
