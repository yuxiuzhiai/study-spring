package com.pk.study.spring;

import lombok.Data;

/**
 * @author pengkai
 * @date 2019/12/12
 */
@Data
public class UserInfo {
    private String a;
    private String b;

    public void test(String a){
        System.out.println("UserInfo.test");
    }
}
