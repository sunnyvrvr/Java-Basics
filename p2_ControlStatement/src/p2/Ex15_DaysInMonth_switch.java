package p2;

import java.util.Scanner;

public class Ex15_DaysInMonth_switch {

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
			switch(month) {
			case 2:days =28;
//			case 4,6,9,11: days = 30;break;
			case 4:days =30;break;			
			case 6:days =30;break;						
			case 9:days =30;break;				
			case 11:days =30;break;				
			default:days =31			
			}
/*			if(month==2)
				days=28;
			else if(month==4||month==6||month==9||month==11)
				days=30;
			else
				days=31;
*/			
		System.out.printf("%2d월은 %2d일까지 임.\n\n",month,days);
		}
		System.out.printf("~end");
		sc.close();
  }
}
