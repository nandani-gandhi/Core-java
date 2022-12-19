package Classes;


// Difference between object instantiation and construction ?
public class Test {

    int i=10;
    int geti(int i)
    {
        return i;
    }
    Test(int t)
    {
        t= this.i;
    }
    public static void main(String[] args) {

        Test test =new Test(20);
        test.i=20;
        test.geti(20);
        Emp emp=new Emp();
        Emp emp1=new Emp();
        Emp emp2=new Emp();
        emp2.display(50 ,"Hetavi");
        emp1.rollno=30;
        emp1.Name="Arshi";
        System.out.println(emp1.rollno+emp1.Name);
        System.out.println(emp.rollno);
        System.out.println(emp.Name);
        emp2.print();
    }
}
class Emp
{
    int rollno = 20;
    String Name ="Nandani";
    void display(int r ,String n)
    {
        rollno=r;
        Name=n;
    }
    void print()
    {
        System.out.println(rollno+Name);
    }
}
