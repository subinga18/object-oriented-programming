package test;
import java.util.Scanner;

public class self {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		String name;
		int roll;
		String address;
		String course;
		
		System.out.println("enter name");
		name=keyboard.nextLine();
		System.out.println("enter roll");
		roll = keyboard.nextInt();
		
		System.out.println("enter address");
		address= keyboard.nextLine();
		address= keyboard.nextLine();
		
		System.out.println("enter course");
		course= keyboard.nextLine();
		
	 System.out.println(name+ " has  roll no. "+roll);
	 System.out.println("his adress is "+address+" and the course he studis is "+course);
	}
}
