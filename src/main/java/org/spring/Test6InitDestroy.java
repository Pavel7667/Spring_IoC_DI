package org.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6InitDestroy {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("applicationContextTwo.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();

        context.close();
    }
}
