package Inheritance;

class PapaDog{
    void eat(){System.out.println("eating...");}
}
class MomDog extends PapaDog{
    void bark(){System.out.println("barking...");}
}
class BabyDog extends MomDog{
    void weep(){System.out.println("weeping...");}
}
class MutiLevale{
    public static void main(String args[]){
        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }}
