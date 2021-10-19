import java.util.Scanner;
import java.lang.Math;

public class ScannerDemo {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[]args) {
		//Menu
		System.out.println("Welcome, please select and option from the following: 1, 2, or 3");
	    //take user input
		int num = sc.nextInt();
		sc.nextLine();
		//response and logic for number inserted
	    System.out.println("You selected " + num);
	    int options = 3;
	    switch (num) {
	        // print random number
	        case 1: num = 1;
	                System.out.println(Math.random());
	                break;
	        //reverse word of user choice
	        case 2: num = 2;
	                reverseString();
	                System.out.println("");
	                break;
	        //exit program
	        case 3: num = 3;
	                break;
	        //handle bad input
	        default: num = 0;
	        		System.out.println("Invalid Number, you had one job!");
	        		break;
	    }		
		sc.close();
	}
	public static String reverseString() {
    	System.out.println("Please enter a phrase to reverse");
    	String str = sc.nextLine();
    	StringBuffer reversed = new StringBuffer("");
    	for(int i = str.length() - 1; i >= 0; i--) {
    		reversed = reversed.append(str.charAt(i));
    	}
    	return reversed.toString();
    	
    	
    }

}
