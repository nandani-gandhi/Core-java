package Classes;

public class StudentThroughMethod {
    int rollno;
    String name;
    void insertRecord(int r, String n){
        rollno=r;
        name=n;
    }
    void displayInformation(){
        System.out.println(rollno+" "+name);
    }
}
class TestStudent{
    public static void main(String args[]){
        StudentThroughMethod s1=new StudentThroughMethod();
        StudentThroughMethod s2=new StudentThroughMethod();
        s1.insertRecord(1,"Kiran");
        s2.insertRecord(2,"Amit");
        s1.displayInformation();
        s2.displayInformation();
    }
}

