package com.pk.study.spring.env;

import org.junit.jupiter.api.Test;
import org.springframework.core.env.Environment;
import org.springframework.web.context.support.StandardServletEnvironment;

/**
 * @author pengkai
 * @date 2019-11-16
 */
public class EnvironmentTest {

    @Test
    public void testSimpleLoad() {
        Environment env = new StandardServletEnvironment();
    }
}
