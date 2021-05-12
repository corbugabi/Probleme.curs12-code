package ro.fasttrackit.curs12.homework;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Classroom classroom = new Classroom(
                List.of(
                        new StudentGrade("Ana","mate", 7),
                        new StudentGrade("Ionut","biologie", 3),
                        new StudentGrade("Andrei","chimie", 10),
                        new StudentGrade("Roxana","mate", 9),
                        new StudentGrade("George","geografie", 10),
                        new StudentGrade("Diana","mate", 7),
                        new StudentGrade("Patrik","mgeografie", 3)
                )
        );

        System.out.println(classroom.getMaxGrade2Iter("mate"));
        System.out.println(classroom.getMaxGrade("mate"));
        System.out.println(classroom.getMaxGrade("nu-exista"));
    }
}
