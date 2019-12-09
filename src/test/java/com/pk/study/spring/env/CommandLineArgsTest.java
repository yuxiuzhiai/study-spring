package com.pk.study.spring.env;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.core.env.SimpleCommandLinePropertySource;

/**
 * @author pengkai
 * @date 2019/12/9
 */
public class CommandLineArgsTest {
    private static final Logger logger = LogManager.getLogger();
    @Test
    public void test() {
        String[] args = {"--a", "--b=bb","--c=a,b,c", "-Dc=true"};
        DefaultApplicationArguments arguments = new DefaultApplicationArguments(args);
        logger.info(arguments.getOptionValues("c"));
        logger.info(arguments.getNonOptionArgs());

        SimpleCommandLinePropertySource ps = new SimpleCommandLinePropertySource(args);
        logger.info(ps.getProperty("b"));
        logger.info(ps.getProperty("c"));
    }
}
