package dao;

import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    public static List<Employee> employeeData()
    {
        List<Employee> list =new ArrayList<>();
        Employee e1 = new Employee(1, 25000, 24, "Mohan", "Male", "mohan@gmail.com", "IT");
        Employee e2 = new Employee(2, 20000, 30, "Kriti", "FeMale", "kriti@gmail.com", "ICT");
        Employee e3 = new Employee(3, 18000, 34, "Kishan", "Male", "Kishan@gmail.com", "BE");
        Employee e4 = new Employee(4, 30000, 22, "Vishal", "Male", "vishal@gmail.com", "IT");
        Employee e5 = new Employee(4, 30000, 22, "Vishal", "Male", "vishal@gmail.com", "IT");
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        return list;
    }

}
