public class hybridInheritance {
    public static void main(String[] args) {
        Mammals M = new Mammals();
        M.eat();
        M.Walk();

        Bird b = new Bird();
        b.fly();

        

    }
}

class Animal {
    String colour;

    void eat() {
        System.out.println("animal can eat");
    }

    void breath() {
        System.out.println("animal can breath");
    }
}

class Mammals extends Animal {
    void Walk() {
        System.out.println("mammal can walk");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("bird can fly");
    }
}

class Dog extends Mammals{
    void type(){
        System.out.println("dog is a mammal and dog type is ptbull");
    }
}