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
        Pet petDog = context.getBean("myPetDog", Pet.class);
        Pet petCat = context.getBean("myPetCat", Pet.class);

        petDog.say();
        petCat.say();

        context.close();
    }
}
