package com.qq30SpringCollections;

import java.util.List;

public class Person {
    private String name;
    private String age;
    private List<Car> cars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", cars=" + cars +
                '}';
    }

    public Person(String name, String age, List<Car> cars) {
        this.name = name;
        this.age = age;
        this.cars = cars;
    }

    public Person(){}


}
