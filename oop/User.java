package oop;

public class User {

    private String name;
    private String email;
    private int age;

    public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.age = 0;
    }

    public User(String name) {
        this.name = name;
        this.email = "Not Provided";
        this.age = 0;
    }

    public User() {
        this.name = "Guest";
        this.email = "Not Provided";
        this.age = 0;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

}
