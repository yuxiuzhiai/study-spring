package com.pk.study.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengkai
 * @date 2019-12-09
 */
@RestController
public class DemoController {
    @RequestMapping("/")
    public String home() {
        return "hello,world";
    }
}
