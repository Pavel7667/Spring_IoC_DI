package org.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {

        // Scanning package
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("applicationContextForAnnotion.xml");

        Dog dog1 = context.getBean("dogBean", Dog.class);
        Dog dog2 = context.getBean("dogBean", Dog.class);
        Cat cat1 = context.getBean("catBean", Cat.class);
        Cat cat2 = context.getBean("catBean", Cat.class);

        boolean dogs = dog1==dog2;
        boolean cats = cat1==cat2;

        System.out.println(dogs);
        System.out.println(cats);
    }
}
