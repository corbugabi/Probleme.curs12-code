package ro.fasttrackit.curs12.curs12homework;

import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        PersonEx person = new PersonEx(List.of(
                new Person("Calin",25,"Saten"),
                new Person("Mihai",11,"Brunet"),
                new Person("Ana",20,"Roscat"),
                new Person("Darin",25,"Saten"),
                new Person("Gabi",21,"Brunet"),
                new Person("Iulian",11,"Blond")
        ));

        System.out.println(person.getPersons());
        System.out.println("----------------");
        System.out.println(person.mapNameToAge());
        System.out.println("----------------");
        System.out.println(person.extractPerson(23));
        System.out.println("-------------------");
        System.out.println(person.mapHairColorToName());
        System.out.println("----------------------");
        System.out.println(person.mapAgeToPersonList());
    }
}
