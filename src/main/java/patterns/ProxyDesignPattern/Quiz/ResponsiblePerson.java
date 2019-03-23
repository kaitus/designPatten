package patterns.ProxyDesignPattern.Quiz;

public class ResponsiblePerson {

    private Person person;

    public ResponsiblePerson(Person person)
    {
        this.person = person;
    }

    public void setAge(int value) {
        person.setAge(value);
    }

    public int getAge() {
        return person.getAge();
    }

    public String drink() {
        return getAge() >= 18 ? person.drink() : "too young";
    }

    public String drive() {
        return getAge() >= 16 ? person.drive() : "too young";
    }

    public String drinkAndDrive() {
        return "dead";
    }
}
