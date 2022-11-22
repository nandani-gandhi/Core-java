package Classes;

public class Employee {

    int id;
    String name;
    }
class EmployeeImp {
    public static void main(String args[]) {
        Employee employee = new Employee();
        employee.id = 1;
        employee.name = "Nandani";
        System.out.println(employee.id + " " + employee.name);
    }
}
