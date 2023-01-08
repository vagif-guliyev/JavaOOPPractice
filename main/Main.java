package main;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("main.User");

        new User();
        new User(5);

        User user = new User();
    }
}
