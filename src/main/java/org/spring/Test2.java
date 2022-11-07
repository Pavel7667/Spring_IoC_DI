package org.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {

        // creating Spring Container
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("applicationContext.xml");

        // getting from  Spring Container  object = Dog
        // Pet is common interface  context.getBean using reflection
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }
}
