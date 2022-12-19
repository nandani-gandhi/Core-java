package keywordSuperFinalThis;



class Bike
{
    final int speedOfBike ;
    final int speedOfCar ;

    Bike() {
        this.speedOfBike=100;
        this.speedOfCar=120;
    }

    final void runBike ()
    {
        System.out.println("Bike is RUN");
    }

}
final class Car
{
    void runCar()
    {
        System.out.println("Car is RUN");
    }
}
public class FinalKeyWord extends Bike {


    static final int speedLimit;
    static {
        speedLimit=80;
    }

//    void run() {
//        a = 400;
//        System.out.println("RUN Fast"+a);
//    }

    public static void main(String args[]) {
        FinalKeyWord finalKeyWord = new FinalKeyWord();
        System.out.println(finalKeyWord.speedOfBike);
        finalKeyWord.runBike();
        Car car =new Car();
        System.out.println(finalKeyWord.speedOfCar);
        car.runCar();
        System.out.println(speedLimit);

    }
}
