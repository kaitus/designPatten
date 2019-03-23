package patterns.FlyweightDesignPattern.RepeatingUserNames;

public class Demo {
    public static void main(String[] args) {
//        User user = new User("Jhon Smith");
//        User user2 = new User("jane Smith");

        User2 user = new User2("Jhon Smith");
        User2 user2 = new User2("jane Smith");
        User2 user3 = new User2("jane Smith jade");

        System.out.println(user2.names.length);
        System.out.println(user3.names.length);
    }
}
