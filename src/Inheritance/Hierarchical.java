package Inheritance;

class WildAnimal
{
    private int speed=20;
    static void FastRun() {

    }
    void eat(){System.out.println("eating...");}
}
class Lion extends WildAnimal
{
    void LionRoar(){System.out.println("Lion Roaring...");}
}
class Tiger extends WildAnimal {
    static void FastRun()
    {
        System.out.println("Both are RUN Fast");
    }

    void TigerRoar(){System.out.println("Tiger Roaring...");}
}

public class Hierarchical {
    public static void main(String[] args) {
        Tiger tiger=new Tiger();
        tiger.TigerRoar();
        tiger.eat();
        tiger.FastRun();
        Lion lion=new Lion();
        lion.LionRoar();
        lion.eat();
    }
}
