package p3;/*수를 입력하여 변수에 할당후, 그 수가 소수인지를 판별하여 아래처럼!
수? 6
6 : 소수아님
수? 3
3 : 소수임
....
수? 1
1 : 소수아님
수? 0
end!!!!
*/
import java.util.Scanner;

public class Ex12_primenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String pan=null;
		while(true) {
			System.out.print("수? ");int n=sc.nextInt();
			if(n<1) break;
			int count=0;//갯수를 구할 변수의 초기치 설정
				for(int i=1;i<=n;i++) {
						if(  n%i==0  )  count++;				
				}//for 
			pan=(count==2)? "소수임":"소수아님";//1) 약수의 갯수가 2개뿐인수		
			System.out.printf("%d : %s\n\n",n,pan);
		}//while
		System.out.println("end!!!!");
		sc.close();
	}
}
/*
    소수 : 1) 약수의 갯수가 2개뿐인수
            2) 1과 자신으로만 나눠지는 수
 */


