package org.spring;

/**
 * Class with common Interface
 */
public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
