// Java program for default method of object class (equals())
package Classes;

public class CompareObject {
        private double re, im;

        public CompareObject(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public boolean equals(Object o) {

            // If the object is compared with itself then return true
            if (o == this) {
                return true;
            }

		/* Check if o is an instance of Complex or not
		"null instanceof [type]" also returns false */
            if (!(o instanceof CompareObject)) {
                return false;
            }

            // typecast o to Complex so that we can compare data members
            CompareObject c = (CompareObject) o;

            // Compare the data members and return accordingly
            return Double.compare(re, c.re) == 0
                    && Double.compare(im, c.im) == 0;
        }

        public static void main(String[] args) {
            CompareObject c1 = new CompareObject(10, 15);
            CompareObject c2 = new CompareObject(10, 15);

            if (c1.equals(c2)) {
                System.out.println("Equal ");
            } else {
                System.out.println("Not Equal ");
            }
        }
    }


