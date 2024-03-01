package p2;

import java.util.Scanner;

public class Ex10_Difference_Twonumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.print("두 수?");

		int a = sc.nextInt( ); int b = sc.nextInt();
		if(a==b) break;
		int diff=(a>b)? a-b:b-a;		
		System.out.println("두 수의 차는"+diff);	
		System.out.println( );
	}	
	System.out.println("종료함!");
	sc.close();
}
}