//What is ClassNotFoundException

package Classes;

public class ClassNotFound {

    public static void main(String[] args) {
        try {
            Class.forName("Classes.Employee");

            ClassLoader.getSystemClassLoader().loadClass("C:\\Users\\RJ\\Desktop\\Classes\\Core-java\\src\\Classes");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
