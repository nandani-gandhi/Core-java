package array;

class EmpDetails
{
    int empId;
    String name;
    int salary;
    //Employee class constructor
    EmpDetails(int eid, String n, int salary){
        empId = eid;
        name = n;
        this.salary=salary;
    }
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
public class Employee {
    public static void main(String args[]){

        EmpDetails[] obj = new EmpDetails[10];

        obj[0] = new EmpDetails(1,"Nandani",20000);
        obj[1] = new EmpDetails(2,"Keval",30000);
        obj[2] = new EmpDetails(3,"Rohan",40000);
        obj[3] = new EmpDetails(4,"Priti",10000);
        obj[4] = new EmpDetails(5,"Rahul",80000);
        obj[5] = new EmpDetails(6,"Om",9000);
        obj[6] = new EmpDetails(7,"Avi",25000);
        obj[7] = new EmpDetails(8,"Mohit",35000);
        obj[8] = new EmpDetails(9,"Hirvi",42000);
        obj[9] = new EmpDetails(10,"Dhruv",45000);

        for(EmpDetails emp: obj)
        {
            System.out.println("Employee Details :"+ emp.getEmpId()+" "+emp.getName());
        }
        EmpDetails empDetails = obj[0];
        for(int i = 0 ;i< obj.length;i++)
        {
            if(empDetails.getSalary() < obj[i].getSalary())
            {
                empDetails= obj[i];
            }
        }
        System.out.println("Max salary is:-"+ empDetails.getSalary());

    }
}
