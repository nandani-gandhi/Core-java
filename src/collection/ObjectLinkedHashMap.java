package collection;

import model.Employee;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ObjectLinkedHashMap {

    public static void main(String args[]) {

        Employee e1 = new Employee(1, 25000, 24, "Mohan", "Male", "mohan@gmail.com", "IT");
        Employee e2 = new Employee(2, 20000, 30, "Kriti", "FeMale", "kriti@gmail.com", "ICT");
        Employee e3 = new Employee(3, 18000, 34, "Kishan", "Male", "Kishan@gmail.com", "BE");
        Employee e4 = new Employee(4, 30000, 22, "Vishal", "Male", "vishal@gmail.com", "IT");
        Employee e5 = new Employee(4, 30000, 22, "Vishal", "Male", "vishal@gmail.com", "IT");
        LinkedHashMap<Integer, Employee> map = new LinkedHashMap<>();//Creating HashMap
        map.put(1, e1);  //Put elements in Map
        map.put(2, e2);
        map.put(3, e3);
        map.put(4, e4);
        map.put(5, e5);
        map.remove(5);
        System.out.println("LinkedHashMap:");

        for (Map.Entry<Integer, Employee> entry : map.entrySet()) {

            int key = entry.getKey();
            Employee e = entry.getValue();
            System.out.println(key + "\tEmployee Details:");
            System.out.println("id is:" + e.getId() + "\tName is:" + e.getName() + "\tSalary is:" + e.getSalary());
        }
    }
}
