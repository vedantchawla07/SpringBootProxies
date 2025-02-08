package org.example;

import org.example.Bean.UserConfig;
import org.example.Service.UserService;
import org.example.classes.Man;
import org.example.classes.Person;
import org.example.classes.PersonInvocationHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.lang.reflect.Proxy;


@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
        Man mohan = new Man("Mohan", 30, "India", "Kolkata");
        ClassLoader mohanClassLoader = mohan.getClass().getClassLoader();
        Class[] interfaces = mohan.getClass().getInterfaces();
        Person proxyMohan = (Person) Proxy.newProxyInstance(mohanClassLoader, interfaces, new PersonInvocationHandler(mohan));
        proxyMohan.introduce();
        proxyMohan.displayAge();
        System.out.println("Vedant 5");

    }
}