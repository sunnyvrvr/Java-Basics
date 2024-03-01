package p2;

import java.util.Scanner;
public class Ex8_Operator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String pan=null;
		while(true) {
			System.out.print("수?:");int n=sc.nextInt();
			if(n<0) break; //break 한 줄로 적기
			pan=(n%2 == 0)? "짝수":"홀수";

			System.out.printf("%d:%s\n",n,pan);
		}//while
		System.out.printf("종료합니다");
		sc.close();
	}	
}
