package java_program;
import java.util.Scanner;
public class userinput {
    public static void main(String[] args)
    {	
        Scanner in = new Scanner(System.in);
        System.out.println("Enter starting range: ");
        int x = in.nextInt();
        System.out.println("Enter ending Range: ");
        int y = in.nextInt();
    }
}