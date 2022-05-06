package collection;

import dao.EmployeeDao;
import model.Employee;

import java.util.HashSet;

public class ObjectHashSet {
    public static void main(String args[]) {
        HashSet<Employee> set = new HashSet<Employee>(EmployeeDao.employeeData());
        System.out.println("Employee list HashSet:");
        for (Employee emplist : set) {

            System.out.println("id is:" + emplist.getId() + "\tName is:" + emplist.getName() + "\tSalary is:" + emplist.getSalary());
        }

    }
}
