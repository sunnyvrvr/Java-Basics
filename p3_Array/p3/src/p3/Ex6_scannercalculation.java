package p3;/*두 수를 입력하여 할당 후, 두 수사이의 수를 출력후 그 수의 합이 출력 
a? 1
b? 10
2 3 4 5 6 7 8 9 합 : xx
a? 10
b? 1
2 3 4 5 6 7 8 9 합 : xx
a? 5
b? 9
6 7 8  합 : xx
....
a? 1
b? 1( a,b같은 값의 입력시 종료)
종료합니다.
*/
import java.util.Scanner;
public class Ex6_scannercalculation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    while(true) {
			System.out.print("a? ");int a=sc.nextInt();
			System.out.print("b? ");int b=sc.nextInt();
			if(a==b) break;
			if(a>b)//10 > 1 
			{//서로의 값을 바꾸기
				int temp=a;//피신
				a=b;
				b=temp;
			}
			//System.out.printf("a : %d\tb : %d\n",a,b);
			int s=0;//합을 구할변수의 초기치 0설정
				for(int i=a+1;i<b;i++) {
					System.out.printf("%d ",i);
					s+=i;//== s=s+i;
				}//for
			System.out.printf("합 : %d\n\n",s);
	    }//while 
	    System.out.println("종료합니다.");
	    sc.close();
	}
}
