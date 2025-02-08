package org.example.classes;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.SQLOutput;

public class PersonInvocationHandler implements InvocationHandler {

    Person person;
    public PersonInvocationHandler(Person person){
        this.person = person;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("this is called before any other method is called");
        System.out.println(method);
        Object result = method.invoke(person, args);
        return result;
    }
}
