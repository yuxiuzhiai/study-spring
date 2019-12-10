package com.pk.study.spring.bean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author pengkai
 * @date 2019-11-16
 */
public class BeanFactoryTest {

    @Test
    public void testSimpleLoad() {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactory.xml"));
        MyBean bean = (MyBean) bf.getBean("myBean");
        assertEquals("testStr", bean.getTestStr());
    }
}
