// Java program for default method of object finalize()
package Classes;

public class FinalizeMethod {

    public static void main(String[] args)
        {
            FinalizeMethod finalizeMethod = new FinalizeMethod();
            System.out.println(finalizeMethod.hashCode());

            finalizeMethod = null;

            System.gc();

            System.out.println("end");
        }

        public void finalize()
        {
            System.out.println("finalize method called");
        }

}
