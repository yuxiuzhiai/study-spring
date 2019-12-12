package com.pk.study.spring;

import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/userInfo")
    public UserInfo userInfo(@RequestParam String a, @RequestParam String b) {
        UserInfo userInfo = new UserInfo();
        userInfo.setA(a);
        userInfo.setB(b);
        return userInfo;
    }

    @PostMapping(value = "/file")
    public int file(MultipartFile file) throws IOException {
        return file.getBytes().length;
    }
}
