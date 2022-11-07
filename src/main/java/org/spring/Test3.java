package org.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {

        // creating Spring Container
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("applicationContext.xml");


        // getting from  Spring Container  object = Dog
        // Pet is common interface  context.getBean using reflection
        // set into Person Constructor HardCoreJava Dependencies object/bean
        // from  Spring Container
        Pet petDog = context.getBean("myPetDog", Pet.class);

        Person person = new Person(petDog);
        person.callYourPet();

        context.close();
    }
}
