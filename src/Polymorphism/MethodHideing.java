package Polymorphism;

class ParentClass
{
    public static void method1()
    {
        System.out.println("Method-1 of the ParentClass class is called.");
    }
    public void method2()
    {
        System.out.println("Method-2 of the ParentClass class is called.");
    }
}

public class MethodHideing extends ParentClass
{
    public static void method1()
    {
        System.out.println("Method-1 of the Child class is called.");
    }
    public void method2()
    {
        System.out.println("Method-2 of the child class is called.");
    }
    public static void main(String args[])
    {
        ParentClass parentClass = new ParentClass();
        ParentClass parentClass1 = new MethodHideing();
        parentClass.method1();
        parentClass1.method1();
        parentClass.method2();
        parentClass1.method2();
    }
}

