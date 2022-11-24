// Which access specifier can be used with Class ? at the top level we declare
// only public or nomodifier
package Classes;

class A{
    private int data=40;
    private void msg()
    {
        System.out.println("Hello java");
    }
}

public class AccessModifier {
    public static void main(String args[]){
        A obj=new A();
//           System.out.println(obj.data);//Compile Time Error
//           obj.msg();//Compile Time Error
    }
}


