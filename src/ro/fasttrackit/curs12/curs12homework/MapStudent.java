package ro.fasttrackit.curs12.curs12homework;

import java.util.HashMap;
import java.util.Map;

public class MapStudent {

    public static void main(String[] args) {

        Map<String, Integer> student = new HashMap<>();

        student.put("Daria", 10);
        student.put("Iulia", 3);
        student.put("Ana", 5);
        student.put("Calin", 4);
        student.put("Edi", 8);
        student.put("Andrei", 9);
        student.put("Iuli", 1);

        System.out.println(student);

        System.out.println("---------------");



    }
}
