package practice_2_1a;

import java.util.Scanner;

public class DigitPerLine {
	public static void main(String[] args) {
		Scanner keyboard =new Scanner(System.in);
		System.out.println("enter 4 digit number:");
		String str=keyboard.next();
		
		System.out.println(str);
		System.out.println("I will print it per line");
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		
		keyboard.close();
	}
	
}
