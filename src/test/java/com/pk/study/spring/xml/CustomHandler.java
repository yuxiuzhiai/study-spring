package com.pk.study.spring.xml;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author pengkai
 * @date 2019/12/14
 */
public class CustomHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("custom",new CustomBeanDefinitionParser());
    }
}
