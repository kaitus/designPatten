package patterns.PrototypeDesignPattern.DontUseClonable;

public class Demo {

    public static void main(String[] args) throws Exception {
        Person jhon = new Person(new String[]{"John", "Smith"}
            , new Address("London Road", 123));
        Person jane = (Person) jhon.clone();
        jane.names[0] = "Jane";
        jane.address.houseNumber = 124;

        System.out.println(jhon);
        System.out.println(jane);
    }
}
