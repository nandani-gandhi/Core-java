package keywordSuperFinalThis;

class Animal {
    void eat() {
        System.out.println("eat");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("eat bread");
    }

    void bark() {
        System.out.println("bark");
    }

    void work() {
        super.eat();
        bark();
    }
}

public class SuperWithMethod {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.work();
    }
}
