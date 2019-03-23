import java.util.Scanner;
public class compare {
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		String str1;
		String str2;
		
		System.out.println("enter str1:");
		str1=keyboard.nextLine();
		System.out.println("enter str2:");
		str2=keyboard.nextLine();
		
		String upperstr1=str1.toUpperCase();
		String upperstr2=str2.toUpperCase();
		
		if(upperstr1.compareTo(upperstr2)<0) {
			System.out.println(str1 +" precede "+str2);
			//str1 is faster than str2 in alphabetic order
		}
		else if(upperstr1.compareTo(upperstr2)>0) {
			System.out.println(str1 +" follows "+str2);
			//str2 is faster than str1 in alphabetic order
		}
		else
			System.out.println(str1 +" equals "+ str2);
		keyboard.close();
		
	}

}
