package test;
import java.util.Scanner;

public class self {
	public static void main(String[] args) {
		String line;
		String newline = null;
	System.out.println("enter a line of text:");
	Scanner keyboard=new Scanner(System.in);
	line=keyboard.nextLine();
	System.out.println("i have rephrased that line to read:");
	for(int i=0;i<line.length();i++) {
		if(line.indexOf("j")!=-1) {
			newline=line.replace('j', 'J');
		}
		
	}
	System.out.println(newline);
	
	}
}
