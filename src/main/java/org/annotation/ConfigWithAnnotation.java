package org.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("applicationContextForAnnotion.xml");


        // call Bean catBean
        Cat cat = context.getBean("catBean",Cat.class);

        context.close();
    }
}
