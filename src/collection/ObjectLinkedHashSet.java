package collection;

import dao.EmployeeDao;
import model.Employee;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class ObjectLinkedHashSet {

    public static void main(String args[]) {
        LinkedHashSet<Employee> set = new LinkedHashSet<>(EmployeeDao.employeeData());
        System.out.println("Employee list with LinkedHAshSet");
        for (Employee emplist : set) {

            System.out.println("id is:" + emplist.getId() + "\tName is:" + emplist.getName() + "\tSalary is:" + emplist.getSalary());
        }
    }
}
