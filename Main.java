public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("User");

        new User();
        new User(5);
    }
}
