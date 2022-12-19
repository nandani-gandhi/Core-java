
package keywordSuperFinalThis;


class ClassA
{
    PassThisAsArgument passThisAsArgument;
    ClassA(PassThisAsArgument passThisAsArgument)
    {
        this.passThisAsArgument=passThisAsArgument;
    }
    void display(){
        System.out.println(passThisAsArgument.num);//using data member of A4 class
    }
    ClassA A()
    {
        return this;
    }
}

public class PassThisAsArgument{
    int num=11;
    void m(PassThisAsArgument obj){
        System.out.println("M method called");

    }
    PassThisAsArgument ()
    {
        new ClassA(this).display();
//        ClassA classA =new ClassA(this);
//        classA .display();
    }
    void p(){
        m(this);
    }
    public static void main(String args[]){
        PassThisAsArgument passThisAsArgument = new PassThisAsArgument();
        passThisAsArgument.p();
    }
}

