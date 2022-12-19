package abstraction;

abstract class Subject
{
    static class SubjectDetails
    {
        String subjectName ="English";
        void display()
        {
            System.out.println("subject is "+ subjectName);
        }
    }
}
abstract class Student extends Subject
{
     abstract void Uname();
     abstract void age();
     abstract void RollNo();

}
abstract class StudentDetails extends Student
{
    void Uname() {
        System.out.println("Name is Jay");
    }
    void age() {
        System.out.println("Age is 23");
    }
    void RollNo() {
        System.out.println("Roll no is 3");
    }

    abstract void DOB();
    abstract void hobby();

}

class Std
{
    abstract class Standard
    {
        void std()
        {
            System.out.println("standard is 10 th");
        }

        abstract void div();
    }

    public class StandardDetails extends Standard
    {
        void div() {
            System.out.println("Div is A");
        }
    }
}
public class MutipleAbstractMethods extends StudentDetails {


    void DOB()
    {
        System.out.println("DOB is 1 jan 2000");
    }
    void hobby()
    {
        System.out.println("hobby is reading");
    }

    public static void main(String[] args) {
        MutipleAbstractMethods mutipleAbstractMethods =new MutipleAbstractMethods();
        Std.StandardDetails standardDetails=new Std().new StandardDetails();
        SubjectDetails subjectDetails =new SubjectDetails();
        subjectDetails.display();
        standardDetails.std();
        standardDetails.div();
        mutipleAbstractMethods.Uname();
        mutipleAbstractMethods.age();
        mutipleAbstractMethods.RollNo();
        mutipleAbstractMethods.DOB();
        mutipleAbstractMethods.hobby();
    }
}
