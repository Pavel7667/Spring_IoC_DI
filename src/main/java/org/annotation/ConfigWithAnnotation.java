package org.annotation;

import org.spring.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation {
    public static void main(String[] args) {

        // Scanning package
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("applicationContextForAnnotion.xml");


        // call Bean "personBean" with seated another Bean "catBean"

        Person person =  context.getBean("personBean", Person.class);
        person.callYourPet();

        context.close();
    }
}
