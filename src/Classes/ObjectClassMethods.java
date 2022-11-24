// Java program of hashCode() and toString() default method of object

package Classes;

public class ObjectClassMethods {

        static  int last_roll = 100;
        int roll_no;

        ObjectClassMethods()
        {
            roll_no = last_roll;
            last_roll++;
        }

        public int hashCode() {
            return roll_no;
        }


        public static void main(String args[])
        {
            ObjectClassMethods s = new ObjectClassMethods();

            System.out.println(s);
            System.out.println(s.toString());
        }
}

