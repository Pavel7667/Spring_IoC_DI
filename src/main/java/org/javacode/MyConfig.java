package org.javacode;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

/**
 * Using JavaCode without XML_file
 */
@Configuration
//@ComponentScan("org.javacode")
// Use MyConfig class as XML_file and creat all Beans here
public class MyConfig {

    @Bean
    public Pet catBean(){
        System.out.println("JavaConfigClass catBean");
        return new Cat(); // create default Singeltone
    }

    @Bean
    public Person personBean(){
        System.out.println("JavaConfigClass personBean");
        return new Person(catBean()); // create default Singeltone
    }
}
