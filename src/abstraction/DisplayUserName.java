package abstraction;

interface Area
{
    public static String areaName = "AHM";
}
interface school
{
    public static String sname = "ABC";
}
class Teacher
{
    int id=2;
    String name="Mital";

}
 abstract class YourName extends Teacher implements school,Area
{
    public abstract void displayName();

    String Name ="Hasti";
    void  displayDetails()
    {
        System.out.println(sname);
        System.out.println(areaName);
        System.out.println(id);
        System.out.println(name);
    }

    YourName(int age)
    {
        System.out.println("Your age is :"+age);
    }
}
abstract class Details extends YourName
{
    void personalDetails()
    {
        System.out.println("Your personal Details");
    }
    Details()
    {
        super(23);
    }
     void PersonalInfo()
    {
        int id= 20;
        System.out.println(id);
    }
}

public class DisplayUserName extends Details {

    public void displayName()
    {
        System.out.println("Your name is:- Nandani");
        System.out.println("Name is :-"+super.Name);
    }


    public static void main(String[] args) {
        DisplayUserName displayUserName=new DisplayUserName();
        displayUserName.displayName();
        displayUserName.personalDetails();
        displayUserName.PersonalInfo();
        displayUserName.displayDetails();
    }

}
