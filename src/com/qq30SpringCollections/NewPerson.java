package com.qq30SpringCollections;

import java.util.Map;

public class NewPerson {
    private String name;
    private String age;
    private Map<String,Car> cars;

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

    public Map<String, Car> getCars() {
        return cars;
    }

    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "NewPerson{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", cars=" + cars +
                '}';
    }
}
