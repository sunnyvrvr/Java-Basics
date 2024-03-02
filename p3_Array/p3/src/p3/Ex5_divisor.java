package p3;/*수를 입력하여 변수에 할당후, 그 수의 약수를 구하고, 그의 갯수를 구해 아래처럼!
수? 6
1 2 3 6  약수의 갯수 : 4개
수? 3
1  3  약수의 갯수 : 2개
....
수? 0
end!!!!
*/
import java.util.Scanner;
public class Ex5_divisor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("수? ");int n=sc.nextInt();
			if(n<1) break;
			int count=0;//갯수를 구할 변수의 초기치 설정
			for(int i=1;i<=n;i++) {
					if(  n%i==0  )   {
						System.out.print(i+" ");
						count++;//==count++; ==  count=count+1;== count+=1;
					}//if
			}//for 
			System.out.printf("약수의 갯수 : %d개\n\n",count);
		}//while
		System.out.println("end!!!!");
		sc.close();
	}
}
/*   6의 약수 ----
6%1== 0    1(o)
6%2== 0    2(o)
6%3== 0    3(o)
6%4!= 0     4(x)
6%5!= 0     5(x)
6%6== 0    6(o)
*/