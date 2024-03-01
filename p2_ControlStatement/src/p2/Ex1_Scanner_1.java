package p2; /*a와 b를 키보드로 입력하여 할당 후 아래처럼!
a? 10
b? 3
--------------
10+3 = 13

*/

import java.util.Scanner;
public class Ex1_입력객체_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String line="---------------"; //줄을 적는법
		while(true) {
		System.out.print("a?");		int a=sc.nextInt();			//nextInc - 메서드
		System.out.print("b?");		int b=sc.nextInt();			//nextInc - 메서드
		
		System.out.println(line); 
//		System.out.printf("a:%d\t: %d\n",a,b); 
		System.out.printf("%d+%d =%d\n",a,b,a+b); 	
		System.out.printf("%d-%d =%d\n",a,b,a-b); 
		System.out.printf("%d*%d =%d\n",a,b,a*b); 
		System.out.printf("%d+%d=%d\n",a,b,a/b);
		System.out.printf("%d+%d=%d%",a,b,a%b);
		
		}
//sc.close(); 에러:unreachable코드에 해당 - 도달하지 못하는 코드 
	}

}
