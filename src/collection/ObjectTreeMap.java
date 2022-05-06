package collection;

import comparator.SalaryComparator;
import model.Employee;

import java.util.*;
import java.util.Map;

public class ObjectTreeMap {

    public static void main(String args[]) {

        Employee e1 = new Employee(1, 25000, 24, "Mohan", "Male", "mohan@gmail.com", "IT");
        Employee e2 = new Employee(2, 20000, 30, "Kriti", "FeMale", "kriti@gmail.com", "ICT");
        Employee e3 = new Employee(3, 18000, 34, "Kishan", "Male", "Kishan@gmail.com", "BE");
        Employee e4 = new Employee(4, 30000, 22, "Vishal", "Male", "vishal@gmail.com", "IT");
        Employee e5 = new Employee(4, 30000, 22, "Vishal", "Male", "vishal@gmail.com", "IT");
        TreeMap<Employee,Integer> map = new TreeMap<>(new SalaryComparator());//Creating HashMap
        map.put(e1,1);  //Put elements in Map
        map.put(e2,2);
        map.put(e3,3);
        map.put(e4,4);
        map.put(e5,5);
        System.out.println("TreeMap:");

        for (Map.Entry< Employee,Integer> entry : map.entrySet()) {

            int key = entry.getValue();
            Employee e = entry.getKey();
            System.out.println(key + "\tEmployee Details:");
            System.out.println("id is:" + e.getId() + "\tName is:" + e.getName() + "\tSalary is:" + e.getSalary());
        }

        Map<Employee,Integer> res = map.descendingMap();
        System.out.println("Employee List in Desending Order:");
        for (Map.Entry< Employee,Integer> entry : res.entrySet()) {

            int key = entry.getValue();
            Employee e = entry.getKey();
            System.out.println(key + "\tEmployee Details:");
            System.out.println("id is:" + e.getId() + "\tName is:" + e.getName() + "\tSalary is:" + e.getSalary());
        }
    }
}
