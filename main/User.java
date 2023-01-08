package main;

public class User extends Person {

    public int salary;

    static {
        System.out.println("Static block is called");
    }

    {
        System.out.println("Non-static/Instance block is called");
    }

    public User() {
        System.out.println("Empty Constructor");
    }

    public User(int a) {
        System.out.println("Numbered Constructor");
    }
}
