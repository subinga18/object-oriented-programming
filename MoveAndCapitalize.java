package practice_2_2;
import java.util.Scanner;

public class MoveAndCapitalize {
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("enter text line:");
		String text=keyboard.nextLine();
		String text2=text.substring(text.indexOf(" ")+1,text.length());
		//공백 다음 단어 ~ 문장 길이(끝) 까지를 text2에 저
		System.out.println(text2.substring(0,1).toUpperCase()+text2.substring(1));
		//text2의 첫단어만 대문자로 바꾸고, text2의 배열1번 단어 부터 추가 출
		keyboard.close();
	}
}
