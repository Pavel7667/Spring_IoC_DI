package org.annotation;

import org.springframework.stereotype.Component;

/**
 * Add connection between XML file/SpringContainer and JavaPackage/Classes
 * @Component = say that from this Class will be creating Beans
 * @Component("catBean") = give id name for this Beans
 */
@Component("catBean")
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
