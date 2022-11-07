package org.spring;


/**
 * Class with common Interface
 */
public class Dog implements Pet {

    @Override
    public void say() {
        System.out.println("bow-bow");
    }
}
