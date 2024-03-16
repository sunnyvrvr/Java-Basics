package p4;/*수를 입력하여 할당후, 그 수의 팩토리얼값을 사용자함수에서 구하고,
출력은 복귀해서 함!
수? 3
3 팩토리얼값 : 6
*/
import java.util.Scanner;
public class Ex12_UserdefinedMethod {	
	static long factorial(int m)//static 리턴자료형 사용자함수명(자료형1 인수1,자료형2 인수2)
	{
    	 // int fact=1;// int<=2147483647
		long  fact=1L;
    	  for(int i=1;i<=m;i++) {
    		  fact*=i;//==  fact=fact*i;
    	  }
    	  return fact;
     }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("수? ");int n=sc.nextInt();
			if(n<0) break;
			//long re=factorial(n);//사용자함수명(전달인수1,전달인수2);
			System.out.printf("%d 팩토리얼값 : %d\n\n",n,factorial(n));
		}//while 
		sc.close();
		System.out.println("end!!!");
	}
}
/*
3 팩토리얼 == 1*2*3 == 3*2*1
5 팩토리얼 ==1*2*3*4*5 

*/