package Solid.DependencyInversionPrinciple;

import org.javatuples.Triplet;

import java.util.List;

public class Research {

    public Research(Relationships relationships, String parent)
    {
        // high-level: find all of john's children
        List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
        relations.stream()
                .filter(x -> x.getValue0().name.equals(parent)
                        && x.getValue1() == Relationship.PARENT)
                .forEach(ch -> System.out.println(parent + " has a child called " + ch.getValue2().name));
    }

    public Research(RelationshipBrowser browser, String parent)
    {
        List<Person> children = browser.findAllChildrenOf(parent);
        for (Person child : children)
            System.out.println(parent + " has a child called " + child.name);
    }

}
