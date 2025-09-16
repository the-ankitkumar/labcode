package java_program;

abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with key");
    }
    public void stop() {
        System.out.println("Car stops with brake");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();   // Output: Dog barks
        a.sleep();   // Output: Sleeping...
    

    Vehicle v = new Car();
        v.start();  // Output: Car starts with key
        v.stop();   // Output: Car stops with brake
    }
}