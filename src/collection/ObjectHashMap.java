package collection;

/*import dao.EmployeeDao;
import model.Employee;*/

import model.Employee;

import java.util.*;

public class ObjectHashMap {
    public static void main(String args[]) {

        Employee e1 = new Employee(1, 25000, 24, "Mohan", "Male", "mohan@gmail.com", "IT");
        Employee e2 = new Employee(2, 20000, 30, "Kriti", "FeMale", "kriti@gmail.com", "ICT");
        Employee e3 = new Employee(3, 18000, 34, "Kishan", "Male", "Kishan@gmail.com", "BE");
        Employee e4 = new Employee(4, 30000, 22, "Vishal", "Male", "vishal@gmail.com", "IT");
        Employee e5 = new Employee(4, 30000, 22, "Vishal", "Male", "vishal@gmail.com", "IT");
        HashMap<Integer,Employee> map=new HashMap<Integer,Employee>();//Creating HashMap
        map.put(1,e1);  //Put elements in Map
        map.put(2,e2);
        map.put(3,e3);
        map.put(4,e4);
        map.put(5,e5);

        System.out.println("TreeMap:");

        for(Map.Entry <Integer, Employee>  entry:map.entrySet()){

            int key=entry.getKey();
            Employee e=entry.getValue();
            System.out.println(key+"\tEmployee Details:");
            System.out.println("id is:" + e.getId() + "\tName is:" + e.getName() + "\tSalary is:" + e.getSalary());
        }

        HashMap<Employee,String> emp=new HashMap<Employee,String>();//Creating HashMap
        emp.put(e1,e1.getName());  //Put elements in Map
        emp.put(e2,e2.getName());
        emp.put(e3,e3.getName());
        emp.put(e4,e4.getName());
        emp.put(e4,e5.getName());
        System.out.println("TreeMap Key as object:");
        for(Map.Entry <Employee, String>  entry:emp.entrySet()){

            Employee key=entry.getKey();
            String e=entry.getValue();
            System.out.println(key+"\tEmployee Details:");
            System.out.println("Name is:" +e);
        }
        Map<Integer, Employee> rev=new HashMap<Integer, Employee>();
        System.out.println("After Sorting");
        TreeMap<Integer,Employee> tm=new  TreeMap<Integer,Employee> (map);
        for(Map.Entry <Integer, Employee>  entry:map.entrySet()){

            int key=entry.getKey();
            Employee e=entry.getValue();
            System.out.println(key+"\tEmployee Details:");
            System.out.println("id is:" + e.getId() + "\tName is:" + e.getName() + "\tSalary is:" + e.getSalary());
        }

    }

}
