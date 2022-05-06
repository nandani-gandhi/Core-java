package collection;

import comparator.AgeComparator;
import dao.EmployeeDao;
import model.Employee;

import java.util.HashSet;
import java.util.TreeSet;

public class ObjectTreeSet {

    public static void main(String args[]) {
        Employee e1 = new Employee(1, 25000, 24, "Mohan", "Male", "mohan@gmail.com", "IT");
        Employee e2 = new Employee(2, 20000, 30, "Kriti", "FeMale", "kriti@gmail.com", "ICT");
        Employee e3 = new Employee(3, 18000, 34, "Kishan", "Male", "Kishan@gmail.com", "BE");
        Employee e4 = new Employee(4, 30000, 22, "Vishal", "Male", "vishal@gmail.com", "IT");
        Employee e5 = new Employee(4, 30000, 22, "Vishal", "Male", "vishal@gmail.com", "IT");
        TreeSet<Employee> set = new TreeSet<Employee>(new AgeComparator());
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        System.out.println("Employee List:");
        for (Employee emplist : set) {

            System.out.println("id is:" + emplist.getId() + "\tName is:" + emplist.getName() + "\tSalary is:" + emplist.getSalary()+
            "\tAge is:"+emplist.getAge());
        }
        TreeSet<Employee> res = (TreeSet<Employee>)set.descendingSet();
        System.out.println("Employee List in Desending Order:");
        for (Employee emplist : res) {

            System.out.println("id is:" + emplist.getId() + "\tName is:" + emplist.getName() + "\tSalary is:" + emplist.getSalary()+
                    "\tAge is:"+emplist.getAge());
        }


    }

}
