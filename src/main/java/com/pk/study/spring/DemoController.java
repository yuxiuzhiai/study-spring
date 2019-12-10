package com.pk.study.spring;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

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

    @PostMapping(value = "/file")
    public int file(MultipartFile file) throws IOException {
        return file.getBytes().length;
    }
}
