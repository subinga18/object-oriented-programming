package self_2;

import java.util.Scanner;

public class self_2 {
	public static void main(String[] args) {
	boolean run =true;
	int balance =0;
	Scanner keyboard=new Scanner(System.in);
	while (run) {
		System.out.println("-----------------");
		System.out.println("1.예금 2.출금 3.잔고 4.종료");
		System.out.println("-----------------");
		System.out.print(" 선 택 > ");
		int check = keyboard.nextInt();
		switch (check) {
		case 1:
			System.out.print("enter 예금액:");
			int money=keyboard.nextInt();
			balance=money+balance;
			break;
		case 2:
			System.out.print("enter 출금액:");
			int out=keyboard.nextInt();
			balance=balance-out;
			break;
		case 3:
			System.out.println("잔고 > "+balance);
			
			break;
		default:
			System.out.println("프로그램 종료");
			run=false;
				
		}
		
		
	}
	}
}
