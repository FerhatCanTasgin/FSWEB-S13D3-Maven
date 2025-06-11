package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    double boy;
    int kilo;
    String kanGrubu;
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName, int age, double boy, int kilo, String kanGrubu){
        this(firstName, lastName, age);
        this.boy = boy;
        this.kilo = kilo;
        this.kanGrubu = kanGrubu;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        if(age >= 13 && age <= 19) {
            return true;
        }
        else{
            return false;
        }
    }
}
