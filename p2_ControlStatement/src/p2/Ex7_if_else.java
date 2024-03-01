package p2;/* 수를 입력하여 할당후, 그 수가 짝수인지를 판별하여 아래처럼!
[2의 배수==2로 나눴을 때 나머지가 0]
수? 10
10? 짝수
수? 111
111: 홀수
...
수입력- 스캐너 객체 기본 
 */
import java.util.Scanner;
public class Ex7_if_else {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String pan=null;
		while(true) {
			System.out.print("수?:");int n=sc.nextInt();
			if(n%2 == 0) //산수>관계
				pan="짝수";
			else
				pan="홀수";

			System.out.printf("%d:%s\n",n,pan);
		}//while
	}	
}
