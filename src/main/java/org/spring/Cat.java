package org.spring;

/**
 * Class with common Interface
 */
public class Cat implements Pet {

    // Detect message to show that bean is creating
    public Cat() {
        System.out.println("Detect message Cat");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
