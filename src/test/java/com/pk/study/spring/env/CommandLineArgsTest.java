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
        //模拟启动时传入的命令行参数
        String[] args = {"--a", "--b=bb","--c=a,b,c","--c=d", "-Dc=true"};
        //使用方式一:通过ApplicationArguments，这是spring boot中才有的
        DefaultApplicationArguments arguments = new DefaultApplicationArguments(args);
        logger.info(arguments.getOptionValues("c"));
        logger.info(arguments.getNonOptionArgs());
        //使用方式二：通过PropertySource
        SimpleCommandLinePropertySource ps = new SimpleCommandLinePropertySource(args);
        logger.info(ps.getProperty("b"));
        logger.info(ps.getProperty("c"));
    }
}
