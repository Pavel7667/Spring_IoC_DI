package org.annotation;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Class with common Interface
 */
@Component("dogBean")

public class Dog implements Pet {

//    private String name;

    // Detect message to show that bean is creating
    public Dog() {
        System.out.println("Detect message Dog");
    }

    @Override
    public void say() {
        System.out.println("bow-bow");
    }


    // add init_destroy
    public void init(){
        System.out.println("Init method");
    }
    // add init_destroy
    public void destroy(){
        System.out.println("Destroy method");
    }
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
