package com.pk.study.spring.xml;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author pengkai
 * @date 2019/12/14
 */
public class XmlBeanDefinitionTest {

    @Test
    public void test(){
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("xmlBeanDefinition.xml"));

        CustomBean bean = beanFactory.getBean(CustomBean.class);
        assertThat(bean.getName()).isEqualTo("this is a name");
    }
}
