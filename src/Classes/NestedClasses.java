//class which has static nested class is called nested classes

package Classes;

public class NestedClasses {
    static class StaticNestedClass
    {
        int id =10;
    }
    static class StaticNestedClass1
    {
        int Marks =80;
    }
    public static void main(String [] args) {
        StaticNestedClass staticNestedClass=new StaticNestedClass();
        StaticNestedClass1 staticNestedClass1=new StaticNestedClass1();
        System.out.println("Hello from Static nested class"+staticNestedClass.id+staticNestedClass1.Marks);
    }
}
