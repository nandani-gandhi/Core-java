package comparator;

import model.Employee;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.salary==o2.salary)
            return 0;
        else if(o1.salary>o2.salary)
            return 1;
        else
            return -1;
    }
}
