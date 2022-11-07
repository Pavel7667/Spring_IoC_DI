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
        myDog.setName("isSingeltone or Prototype");
        yourDog.setName("Singeltone re_write in One object Value");

        System.out.println(isSingeltone);
        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());


    }
}
