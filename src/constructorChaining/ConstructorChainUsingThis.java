package constructorChaining;


class BaseClass
{
    BaseClass()
    {
        System.out.println("BaseClass calling");
    }
}
public class ConstructorChainUsingThis extends BaseClass {
    ConstructorChainUsingThis()
    {
        this("java");
        System.out.println("Default constructor called.");
    }
    ConstructorChainUsingThis(String str)
    {
        super();
        System.out.println("Parameterized constructor called");
    }

    public static void main(String args[])
    {

        ConstructorChainUsingThis cc = new ConstructorChainUsingThis();

    }
}
