package p2;/*
이름: 홍길동
왼쪽, 오른쪽 시력?? 1.2 1.3  - 1행에 두 개 입력, 데이터의 구별: \t, 
-----------------------
이름: xxxxx
평균시력 : x.xx
*/
import java.util.Scanner;

public class Ex2_AverageEyesight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String line="------------------";
		while(true){
		System.out.print("이름?"); String name=sc.next(); //String name=sc.nextLine();
		System.out.println("왼쪽, 오른쪽 시력??"); double leye=sc.nextDouble(); //String name=tc.nextDouble();
												double reye=sc.nextDouble(); //String name=tc.nextDouble();
		double ave=(leye+reye)/2; 
		
		System.out.println(line);
		System.out.printf("이름:%s\n ",name);
		System.out.printf("%f\t%f\n",leye,reye);		
		System.out.printf("평균시력: %.2f\n",ave);	
		} //while;
	}

}
