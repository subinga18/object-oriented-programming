//nested loops_java
package tester;
import java.util.Scanner;

public class tester_1{
	public static void main(String[] args) {
	System.out.println("do you want to average exam?");
	System.out.println("enter yes or no");
	
	Scanner keyboard= new Scanner(System.in);
	String ans=keyboard.nextLine();
	double sum;
	int student;
	double num;
	
	
	do {
	
	System.out.println("enter all scores to be averaged");
	System.out.println("enter a negative number after");
	System.out.println("you have all the scores");
	sum=0;
	student=0;
	num=keyboard.nextDouble();
	while(num>=0) {
		sum=sum+num;
		student ++;
		num=keyboard.nextDouble();
	}
		if(student>0){
			System.out.println("the average is "+sum/student);
		}
		else {
		System.out.println("something is wrong");
		}
	
	}while(ans.equalsIgnoreCase("yes"));
	
	keyboard.close();
	}
}

