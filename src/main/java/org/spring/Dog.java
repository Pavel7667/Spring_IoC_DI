package org.spring;


/**
 * Class with common Interface
 */
public class Dog implements Pet {

    // Detect message to show that bean is creating
    public Dog() {
        System.out.println("Detect message Dog");
    }

    @Override
    public void say() {
        System.out.println("bow-bow");
    }
}
