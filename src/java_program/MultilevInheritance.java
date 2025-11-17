import java.util.Scanner;

public class MultilevInheritance {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Dog d = new Dog();
        d.eat();
        d.leg=4;
        System.out.println(d.leg);
        d.name(sc);
        sc.close();
        d.breed="Pitbull";
        System.out.println(d.breed);
        


    }
}
class Animal{
    String colour;
    void eat(){
        System.out.println("animal can eat");
    }
    void breath(){
        System.out.println("animal can breath");
    }
}
class Mammals extends Animal{
    int leg;
    void name(Scanner sc){
        System.out.print("write the mammal name: ");
        String mammalname = sc.nextLine();
    }
}
class Dog extends Mammals{
    String breed;
}