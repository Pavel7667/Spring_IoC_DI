package org.javacode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {

    //    @Autowired
//    @Qualifier("dogBean")
    private Pet pet;


    private String name;

    private int age;

//    @Autowired work Single
//    @Qualifier("dogBean") NOO Combine
// But if use @Qualifier into parameter

    @Autowired
    public Person(@Qualifier("dogBean") Pet pet) {
        this.pet = pet;
    }

    public Person() {
        System.out.println("Detect message Person");
    }


    //    @Autowired
//    @Qualifier("dogBean")
    public void setPet(Pet pet) {
        System.out.println("Setting using Setter and Constructor are same, " +
                "just use @Autowired");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("hi pet");
        pet.say();
    }

    public void setName(String name) {
        System.out.println("Showing that methods starts first in " +
                "applicationContext");
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("Showing that methods starts first in " +
                "applicationContext");
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pet=" + pet +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
