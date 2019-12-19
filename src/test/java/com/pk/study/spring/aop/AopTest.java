package com.pk.study.spring.aop;

import com.pk.study.spring.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author pengkai
 * @date 2019-12-17
 */
public class AopTest {
    @Test
    public void testSimpleLoad() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("aopTest.xml");
        UserInfo userInfo = ac.getBean(UserInfo.class);
        userInfo.test("abc");
    }
}
