package constructorChaining;

public class OrderOfExecution {
    static{
        System.out.println(" this is a static block");
    }
    OrderOfExecution(){
        System.out.println(" this a constructor");
    }
    public static void demo() {
        System.out.println(" this is an instance method");
    }
    public static void main(String args[]){
        new OrderOfExecution().demo();
    }
}
