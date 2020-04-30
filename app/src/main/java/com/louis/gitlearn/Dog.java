package com.louis.gitlearn;

public class Dog {
    private String name;
    private int age;
    private int color;

    public Dog(String name, int age, int color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getColor() {
        return color;
    }
}
