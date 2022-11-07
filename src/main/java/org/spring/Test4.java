package org.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        // creating Spring Container
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("applicationContext.xml");

        // In Spring Container we have configuration of this Bean with
        // parameters in Constructor
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        context.close();
    }
}
