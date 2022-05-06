package collection;

import model.Employee;

import java.util.HashMap;

public class ObjectConcurrentHashMap {

    public static void main(String[] args)
    {
        Employee e1 = new Employee(1, 25000, 24, "Mohan", "Male", "mohan@gmail.com", "IT");
        Employee e2 = new Employee(2, 20000, 30, "Kriti", "FeMale", "kriti@gmail.com", "ICT");
        Employee e3 = new Employee(3, 18000, 34, "Kishan", "Male", "Kishan@gmail.com", "BE");
        Employee e4 = new Employee(4, 30000, 22, "Vishal", "Male", "vishal@gmail.com", "IT");
        // crete a HashMap and add some values
        HashMap<Employee, Integer> mapcon
                = new HashMap<>();
        mapcon.put(e1, 100);
        mapcon.put(e2, 200);
        mapcon.put(e3, 300);
        mapcon.put(e4, 400);
        System.out.println("HashMap values :\n " + mapcon.toString());
        mapcon.computeIfAbsent(e1, k -> 200 + 300);
        mapcon.computeIfAbsent(e2, k -> 60 * 10);
        System.out.println("New HashMap after computeIfAbsent :\n "+ mapcon);
    }
}
