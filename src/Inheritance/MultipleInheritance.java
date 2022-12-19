package Inheritance;

interface UserName
{
    void diplayUname();

}
interface Password
{
    void displayPassword();
}


public class MultipleInheritance implements UserName,Password {

    public void diplayUname()
    {
        System.out.println("name is Nandani");
    }

    public void displayPassword()
    {
        System.out.println("Password is nandani");
    }

    public static void main(String[] args) {
        MultipleInheritance multipleInheritance =new MultipleInheritance();
        multipleInheritance.diplayUname();
        multipleInheritance.displayPassword();
    }

}
