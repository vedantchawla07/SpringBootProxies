package org.example.classes;

public class Man implements Person{

    String name;
    int age;
    String city;
    String country;

    public Man(String name, int age, String country, String city){
        this.age = age;
        this.name = name;
        this.country = country;
        this.city = city;
    }
    @Override
    public void introduce() {
        System.out.println("My name is " + name);
    }

    @Override
    public void displayAge() {
        System.out.println("My age is " + age);
    }
}
