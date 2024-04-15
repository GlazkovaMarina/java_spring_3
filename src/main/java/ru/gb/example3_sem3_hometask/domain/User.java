package ru.gb.example3_sem3_hometask.domain;

public class User {

    private String name;
    private int age;
    private String email;

    public User(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public User(){
        this.name = "";
        this.age = 0;
        this.email = "";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}