package com.pk.study.spring.bean;

/**
 * @author pengkai
 * @date 2019-11-16
 */
public class MyBean {
    private String testStr = "testStr";
    private Foo foo;

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    public Foo getFoo() {
        return foo;
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }
}
