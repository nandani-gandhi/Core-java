package Polymorphism;

public class CompileTimePoly {

    void displayNumber(int num1)
    {
        System.out.println("number 1 : " + num1);
    }

    // 2 parameter
    void displayNumber(int num1, int num2)
    {
        System.out.println("number 1 : " + num1
                + "  number 2 : " + num2);
    }

    public static void main(String[] args)
    {
        CompileTimePoly obj = new CompileTimePoly();

        obj.displayNumber(3);

        obj.displayNumber(4, 5);
    }
}