package selfstudy;
import java.util.Scanner;
public class selfstudy {
	public static void main(String[] args) {
		//for문 이용하여 1부터 100까지 정수중 3의 배수의 총합 구하기
		int i=0;
		int sum=0;
		for(i=1;i<=100;i++) {
			if(i%3==0) {
				sum=sum+i;
			}
		}
		System.out.println("3의 배수 총합은 "+sum);
	
		
		
		// while문과 scanner이용하여 키보드로부터 입력된 데이터로 예금 출금 조회 종료기능을 제공하는 코드를 작성해보세요.
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
