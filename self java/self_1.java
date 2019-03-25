package self_1;

public class self_1 {
	public static void main(String[] args) {
	// 중첩 for문 이용하여 4x+5y=60의 모든해를 (x,y)의 형태로 출력
			
			 int x,y;
			
			for(x=1;x<=10;x++) {
				for(y=1;y<=10;y++) {
					if(4*x+5*y==60) {
						System.out.println("("+x+","+y+")");
					}
						
					}
			}
		
}
}
