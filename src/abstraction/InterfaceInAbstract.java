package abstraction;

interface Study {
    void learnCoding();
    void learnProgrammingLanguage();
    void contribute();
}

abstract class LearnCode implements Study {

    public void learnCoding()
    {
        System.out.println(
                "Learn");
    }
    public void learnProgrammingLanguage()
    {
        System.out.println(
                "Learn Programs");
    }
}

class ExtendInterface extends LearnCode {

    public void contribute()
    {
        System.out.println(
                "Lets help");
    }
}

// Driver code
public class InterfaceInAbstract {
    public static void main(String[] args)
    {
        ExtendInterface extendInterface = new ExtendInterface();

        extendInterface.learnCoding();
        extendInterface.learnProgrammingLanguage();
        extendInterface.contribute();
    }
}

