package p3;/*1~ 100까지 출력(1행에 10개씩)후 그 수의 합을 구해 아래처럼!
   1 2 3....  10
 11 ..         20
 21 ...        30
...
 91 ..       100
 ---------------
 합 : xxxx
*/
public class Ex4_sum {
	public static void main(String[] args) {
		String line="----------------------------------------";
		int sum=0;//합을 구하기 위한 변수의 초기치 
		for(int i=1;i<=100;++i) {
			System.out.printf("%4d",i);
			sum+=i;// == sum=sum+i;
			if( i%10==0 ) System.out.printf("\n");
		}//for 
		System.out.println(line);
		System.out.printf("합 : %d\n",sum);
	}
}
