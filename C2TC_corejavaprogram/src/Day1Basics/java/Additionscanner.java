package Day1Basics.java;

import java.util.Scanner; // This line was missing

public class Additionscanner {
    
    public static void main(String[] args) {
        int a, b, c;
        Scanner s = new Scanner(System.in);  // Create Scanner object
        System.out.println("Enter the values:");

        a = s.nextInt();  // Read first integer
        b = s.nextInt();  // Read second integer

        c = a + b;  // Perform addition

        System.out.println("Addition of a = " + a + " and b = " + b + " is " + c);

        s.close();
		
	}

}
