package org.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5XMLScope {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("applicationContextTwo.xml");

        //Creating default scope Singeltone
        Dog myDog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);

        //This links pointing in one Object
        boolean isSingeltone = myDog == yourDog;

        System.out.println(isSingeltone);


    }
}
