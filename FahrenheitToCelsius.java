package practice_2_1b;
import java.util.Scanner;

public class FahrenheitToCelsius {
public static void main(String[] args) {
	double f,c;
	Scanner keyboard=new Scanner(System.in);
	System.out.println("enter fahrenheit temperature:");
	f=keyboard.nextDouble();
	c=5*(f-32)/9;
	
	System.out.println("celsius temperature is  "+c);
	
	keyboard.close();
}
}
