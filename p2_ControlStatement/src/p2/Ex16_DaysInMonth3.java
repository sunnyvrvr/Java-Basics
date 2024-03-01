package p2;
/* 월을 입력받아 변수에 할당후, 날수를 분류하여 할당
월? 3
xx월은 xx일 까지임
월? 2
xx월은 28일 까지임
월? 13
월의 입력범위[1~12]오류...다시 월?13
xx월은 xx일까지임.
월? -999
end~~~
 */
import java.util.Scanner;
public class Ex16_DaysInMonth3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int days=0;
		while(true) {
			System.out.print("월?"); int month=sc.nextInt();
			if(month==-999) break;	
			if(month<1||month>12) {
			System.out.printf("월의 입력범위[1~12]오류...다시");
			continue; //while의 조건식으로 올라감 !!
			}
			
			if(month==2)
				days=28;
			else if(month==4||month==6||month==9||month==11)
				days=30;
			else
				days=31;
			
		System.out.printf("%2d월은 %2d일까지 임.\n\n",month,days);
		}
		System.out.printf("~end");
		sc.close();
  }
}

/*
28일: 2월
30일: 4,6,9,11월
31일: 1,3,5,7,8,9,10,12월
 */

