// Java program for default method of object getClass()
package Classes;

public class GetClassMethod {


        public static void main(String[] args)
        {
            Object obj = new String("Nandani");
            Class c = obj.getClass();
            System.out.println("Class of Object obj is : "
                    + c.getName());
        }
}

