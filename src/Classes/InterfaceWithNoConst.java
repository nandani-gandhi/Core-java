/* we can not define constructor inside interface because it does not accept
* method without return type in interface */

package Classes;

public class InterfaceWithNoConst {

    public interface MyInterface{
//        MyInterface();
//        {
//           System.out.println("This is the constructor of the interface");
//        }
        public static final int num = 10;
        public abstract void demo();
    }
    class Implement implements MyInterface
    {
        public void demo() {
            System.out.println("Demo of constructor inside Interface"+num);
        }
    }
    public static void main(String args[]) {
        Implement obj = new InterfaceWithNoConst().new Implement();
        obj.demo();
    }
}
