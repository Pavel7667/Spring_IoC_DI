package org.javacode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaCodeWayOne {
    public static void main(String[] args) {

        // creating Spring Container with JavaClass
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);


        Cat cat = context.getBean("catBean", Cat.class);
        cat.say();
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        context.close();
    }
}
