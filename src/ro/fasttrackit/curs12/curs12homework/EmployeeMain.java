package ro.fasttrackit.curs12.curs12homework;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        EmploywwEx employee = new EmploywwEx(List.of(
                new Employee("Ana",34,"saten","Plexus",3000),
                new Employee("Calin",21,"saten","Electrica",2500),
                new Employee("Iulian",45,"saten","Time",2000),
                new Employee("Maria",31,"saten","Plexus",2500),
                new Employee("Irina",19,"saten","Electrica",2000),
                new Employee("Alin",50,"saten","Rivo",2800)
        ));

        System.out.println(employee.getEmployees());
        System.out.println("-----------------");
        System.out.println(employee.extractPerson(2200));
        System.out.println("-----------------");
        System.out.println(employee.mapHCompanyToPerson("Electrica"));
        System.out.println("-----------------");
        System.out.println(employee.sumOfAllSalary());
    }
}
