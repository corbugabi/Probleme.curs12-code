package ro.fasttrackit.curs12.curs12homework;

import java.util.*;

public class EmploywwEx {
    private final List<Employee> employees= new ArrayList<>();

    public EmploywwEx(Collection<Employee> employees){
        this.employees.addAll(employees);
    }

    public List<Employee> getEmployees(){
        return employees;
    }

    public List<Employee> extractPerson(int amount){
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSalary() > amount) {
                result.add(employee);
            }
        }
        return result;
    }

    public Map<String, List<Employee>> mapHCompanyToPerson(String name) {
        Map<String, List<Employee>> result = new HashMap<>();
        for (Employee employee : employees) {
            List<Employee> existlist = result.get(employee.getCompany());
            if (employee.getCompany().equals(name)) {
                if (existlist == null) {
                    existlist = new ArrayList<>();
                }
                existlist.add(employee);
                result.put(employee.getCompany(), existlist);
            }
        }
        return result;
    }

    public Integer sumOfAllSalary(){
        int sum = 0;
        for (Employee employee : employees){
            sum += employee.getSalary();
        }
        return sum;
    }
}
