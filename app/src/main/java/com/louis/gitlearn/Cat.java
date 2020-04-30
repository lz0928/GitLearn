package com.louis.gitlearn;

public class Cat {
    private String naem;
    private int age;

    public Cat(String naem, int age) {
        this.naem = naem;
        this.age = age;
    }

    public void setNaem(String naem) {
        this.naem = naem;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNaem() {
        return naem;
    }

    public int getAge() {
        return age;
    }
}
