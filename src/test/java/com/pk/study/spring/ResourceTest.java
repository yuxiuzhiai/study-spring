package com.pk.study.spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.Arrays;

/**
 * @author pengkai
 * @date 2019-12-08
 */
public class ResourceTest {

    @Test
    public void test() throws IOException {
        //当ResourceLoader用
        ApplicationContext ac = new AnnotationConfigApplicationContext();
        //其实返回的并不是ClassPathResource,而是DefaultResourceLoader$ClassPathContextResource
        //如果没有特定协议前缀的话,对于不同的ApplicationContext实现,这里的处理也不一样
        //如果上面的AC实现换成FileSystemXmlApplicationContext,那就会把b.txt当成相对于项目目录的相对路径来处理
        Resource classpathResource = ac.getResource("b.txt");
        //返回UrlResource
        Resource urlResource = ac.getResource("http://www.baidu.com");
        //返回FileUrlResource(本地的这个绝对路径下要用这个文件不然报错)
        Resource fileResource = ac.getResource("file:/logs/controller.log");
        //返回ClassPathResource[]
        Resource[] resources = ac.getResources("classpath*:b.txt");

        printResource(classpathResource);

        printResource(urlResource);

        printResource(fileResource);

        Arrays.stream(resources).forEach(ResourceTest::printResource);
    }

    private static void printResource(Resource resource) {
        System.out.println("start resource print...");
        System.out.println("class:" + resource.getClass().getName());
        System.out.println("exists:" + resource.exists());
        System.out.println("isReadable:" + resource.isReadable());
        System.out.println("isOpen:" + resource.isOpen());
        System.out.println("isFile:" + resource.isFile());
        try {
            System.out.println("getURL:" + resource.getURL());
            System.out.println("getURI:" + resource.getURI());
            System.out.println("getFile:" + resource.getFile());
            System.out.println("contentLength:" + resource.contentLength());
            System.out.println("lastModified:" + resource.lastModified());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("getFilename:" + resource.getFilename());
        System.out.println("getDescription:" + resource.getDescription());
        System.out.println("end resource print...");
    }
}
