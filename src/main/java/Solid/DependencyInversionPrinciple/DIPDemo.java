package Solid.DependencyInversionPrinciple;

public class DIPDemo {

    public static void main(String[] args)
    {
        Person parent = new Person("John");
        Person child1 = new Person("Chris");
        Person child2 = new Person("Matt");
        Person child3 = new Person("Cris");


        Person parent2 = new Person("Gomez");
        Person childP2 = new Person("Isabella");

        // low-level module
        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent, child1);
        relationships.addParentAndChild(parent, child2);
        relationships.addParentAndChild(parent, child3);
        relationships.addParentAndChild(parent2, childP2);

        new Research(relationships, parent.name);
        System.out.println("/************** TEST2 **************+/");
        new Research(relationships, parent2.name);


    }

}
