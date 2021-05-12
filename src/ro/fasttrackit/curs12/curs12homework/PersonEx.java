package ro.fasttrackit.curs12.curs12homework;

import java.util.*;

public class PersonEx {
    private final List<Person> persons = new ArrayList<>();

    public PersonEx(Collection<Person> persons) {
        this.persons.addAll(persons);
    }

    public List<Person> getPersons() {
        return persons;
    }

    public Map<String, Integer> mapNameToAge() {
        Map<String, Integer> result = new HashMap<>();
        for (Person person : persons) {
            result.put(person.getName(), person.getAge());
        }
        return result;
    }

    public List<Person> extractPerson(int age) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() > age) {
                result.add(person);
            }
        }
        return result;
    }

    public Map<String, List<String>> mapHairColorToName() {
        Map<String, List<String>> result = new HashMap<>();
        for (Person person : persons) {
            List<String> existlist = result.get(person.getHairColor());
            if (existlist == null) {
                existlist = new ArrayList<>();
            }
            existlist.add(person.getName());
            result.put(person.getHairColor(), existlist);
        }
        return result;
    }

    public Map<Integer, List<Person>> mapAgeToPersonList() {
        Map<Integer, List<Person>> result = new HashMap<>();
        for (Person person : persons) {
            List<Person> existedList = result.get(person.getAge());
            if (existedList == null) {
                existedList = new ArrayList<>();
            }

            existedList.add(person);
            result.put(person.getAge(), existedList);
        }
        return result;
    }
}
