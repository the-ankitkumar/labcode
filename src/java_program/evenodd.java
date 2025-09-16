package java_program;

import java.util.Scanner;
public class evenodd {
	public static void main(String args[]) {
		System.out.println("enter a numbers:");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
        if (x % 2 == 0) {
            System.out.println(x + " is Even");
        } else {
            System.out.println(x + " is Odd");
        }
	}

}
