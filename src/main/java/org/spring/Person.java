package org.spring;

public class Person {

    private Pet pet;
    private String name;
    private int age;

    // Changing ConfigFile xml
//    public Person(Pet pet) {
//        this.pet = pet;
//    }

    public Person() {
        System.out.println("Detect message Person");
    }

    // pet -> setPet
    // ref pet = Spring magick = set + ref(pet->Pet) = setPet
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("hi pet");
        pet.say();
    }

    // name -> setName
    // ref name = Spring magick = set + ref(name->Name) = setName
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
