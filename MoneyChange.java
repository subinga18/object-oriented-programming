package practice_2_3a;
import java.util.Scanner;
public class MoneyChange {
 public static void main(String[] args) {
	 int item,quarter,dime,nickle,change;
	 Scanner keyboard=new Scanner(System.in);
	 
	 System.out.println("you paid 100 cents");
	 System.out.print("enter how much is the item cost:");
	 item=keyboard.nextInt();
	 
	 System.out.println("===quarter: 25 cents , dime: 10 cents , nickle: 5 cents===");
	 change=100-item;
	 quarter=change/25;
	 dime= (change%25)/10;
	 nickle=((change%25)%10)/5;
	 
	 System.out.println("change : "+change +" cents");
	 System.out.println("quarter : "+quarter);
	 System.out.println("dime : "+dime);
	 System.out.println("nickle : "+nickle);
	 
	 keyboard.close();
 }
}
