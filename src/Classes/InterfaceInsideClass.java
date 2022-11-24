/* We can make an Interface inside class and it is called  nested interface for
* we need to make another class inside main class which implements the interface
* and also we can use interface by using class name */


package Classes;

public class InterfaceInsideClass {
    interface myInterface {
        void demo();
    }
    class Inner implements myInterface {
        public void demo() {
            System.out.println("Hello from Demo");
        }
    }
    class Inner1 implements InterfaceInsideClass.myInterface {
        public void demo() {
            System.out.println("Hello from Demo");
        }
    }
    public static void main(String args[]) {
        Inner obj = new InterfaceInsideClass().new Inner();
        obj.demo();
    }
}




