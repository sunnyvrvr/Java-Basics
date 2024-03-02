package p3;/*3장ppt6
정수를 입력하고 마지막에 0을 입력하세요.
10 30 –20 40 0
수의 개수는 4개이며 평균은 15.0입니다.
*/
import java.util.Scanner;
public class Ex8_count_average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0, n=0; 
		double sum=0.0; 

		System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
		/*while(true) {
			n = sc.nextInt();
			if(n==0) break;
			sum = sum + n;
			count++;
		}*/
		while(  (n = sc.nextInt()) != 0) { // 0이 입력되면 while 문 벗어남
			sum = sum + n;
			count++;
		}
		System.out.print("수의 개수는 " + count + "개이며 ");
		System.out.println("평균은 " + sum/count + "입니다.");
		sc.close();
	}
}
