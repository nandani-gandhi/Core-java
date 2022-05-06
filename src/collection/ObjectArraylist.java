package collection;

import java.util.*;

import comparator.AgeComparator;
import comparator.SalaryComparator;
import dao.EmployeeDao;
import model.Employee;

public class ObjectArraylist {

  public static void main(String args[]) {

      List<Employee> emp = EmployeeDao.employeeData();
      Collections.sort(emp,new SalaryComparator());
      System.out.println("Sort by Salary");
      for(Employee emplist:emp)
      {
          System.out.println("id is:"+emplist.getId()+"\tName is:"+emplist.getName()+"\tSalary is:"+emplist.getSalary());
      }
      Collections.sort(emp,new AgeComparator());
      System.out.println("Sort by Age");
      for(Employee emplist:emp)
      {
          System.out.println("id is:"+emplist.getId()+"\tName is:"+emplist.getName()+"\tSalary is:"+emplist.getSalary()+"\tAge is:"+emplist.getAge());
      }
  }
}
