package com.pk.study.spring;

import org.junit.jupiter.api.Test;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author pengkai
 * @date 2019-12-17
 */
public class ApplicationContextTest {
    @Test
    public void testSimpleLoad() {
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        ac.register(MyConfig.class);
        ac.refresh();
        UserInfo userInfo = ac.getBean(UserInfo.class);
        assertEquals("a", userInfo.getA());
    }
}
