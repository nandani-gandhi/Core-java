package collection;

import comparator.SalaryComparator;
import dao.EmployeeDao;
import model.Employee;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class ObjectLinkedlist {
    public static void main(String args[]) {
        List<Employee> emp = new LinkedList<>(EmployeeDao.employeeData());
        for (Employee emplist : emp) {

            System.out.println("id is:" + emplist.getId() + "\tName is:" + emplist.getName() + "\tSalary is:" + emplist.getSalary());
        }
        LinkedList<Employee> linkedList =new LinkedList<>(emp);
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("remove first and last Element");
        for (Employee emplist : linkedList) {

            System.out.println("id is:" + emplist.getId() + "\tName is:" + emplist.getName() + "\tSalary is:" + emplist.getSalary());
        }
        System.out.println("Sort by Salary");
        Collections.sort(linkedList,new SalaryComparator());
        for (Employee emplist : linkedList) {

            System.out.println("id is:" + emplist.getId() + "\tName is:" + emplist.getName() + "\tSalary is:" + emplist.getSalary());
        }
    }
}
