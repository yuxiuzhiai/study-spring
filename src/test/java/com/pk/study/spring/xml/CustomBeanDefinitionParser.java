package com.pk.study.spring.xml;

import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

/**
 * @author pengkai
 * @date 2019/12/14
 */
public class CustomBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
    @Override
    protected Class<?> getBeanClass(Element element) {
        return CustomBean.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String name = element.getAttribute("name");
        if(StringUtils.isNotBlank(name)){
            builder.addPropertyValue("name",name);
        }
    }
}
