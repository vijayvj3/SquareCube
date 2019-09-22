package squarecube;

import java.util.Scanner;

public class SquareCube {
    public static int square(int a) {
    	return a*a;
    }
    public static int cube(int a) {
    	return a*a*a;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		System.out.println("Square of "+a+" is "+square(a));
		System.out.println("Cube of "+a+" is "+cube(a));
        sc.close();

	}

}
