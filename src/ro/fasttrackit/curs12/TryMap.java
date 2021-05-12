package ro.fasttrackit.curs12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TryMap {
    public static void main(String[] args) {
        Map<String, Integer> nameToAge = new HashMap<>();

        nameToAge.put("Ana", 20);
        nameToAge.put("Ioan", 43);
        nameToAge.put("Maria", 51);
        nameToAge.put("Dragomir", 35);
        nameToAge.put("Mircea", 32);

        System.out.println(nameToAge);

        System.out.println(nameToAge.get("Maria"));

        nameToAge.remove("Dragomir");
        System.out.println(nameToAge);

        System.out.println(nameToAge.containsKey("Maria"));
        System.out.println(nameToAge.containsKey("Dragomir"));
        System.out.println(nameToAge.keySet());
        System.out.println(nameToAge.values());
        Set<Map.Entry<String, Integer>> entries = nameToAge.entrySet();
        System.out.println(entries);

        for (String name : nameToAge.keySet()){
            System.out.println(name + " are varsta " + nameToAge.get(name));
        }

        System.out.println("--------------------------");

        for (Map.Entry entry : nameToAge.entrySet()){
            System.out.println(entry.getKey() + " are varsta " + entry.getValue());
        }
    }
}
