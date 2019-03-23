package patterns.ProxyDesignPattern.Quiz;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Example #1");

        Person person = new Person(5);
        ResponsiblePerson responsiblePerson = new ResponsiblePerson(person);
        System.out.println(responsiblePerson.drink());
        System.out.println(responsiblePerson.drive());
        System.out.println(responsiblePerson.drinkAndDrive());

        System.out.println("\nExample #2");

        Person person1 = new Person(20);
        ResponsiblePerson responsiblePerson1 = new ResponsiblePerson(person1);
        System.out.println(responsiblePerson1.drink());
        System.out.println(responsiblePerson1.drive());
        System.out.println(responsiblePerson1.drinkAndDrive());

    }
}
