package p2; /*
점수가 90점 이상이면 A,
80점 이상이면 B,
70점 이상이면 C,
60점 이상이면 D,
60점 미만이면 F

점수? 95
점수: xxx 	평가: x
-조건추가-
점수? 101
 점수의 입력범위[0~100]오류...다시점수? 101
 점수의 입력범위[0~100]오류...다시점수? -11
 점수의 입력범위[0~100]오류...다시점수? 77
점수: xxx 평가:x
점수? 999
end!!

 */
import java.util.Scanner;

public class Ex17_Multiple-if-else {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char grade='@';

		while(true) {
			System.out.print("점수?"); int score=sc.nextInt();
			if(score==999) break;
			if(score<0 || score>100) {
				System.out.print("\t점수의 입력범위[0~100]오류...다시");
				continue;//while
			}
			if(score>=90)
				grade='A';
			else if(score>=80)
				grade='B';
			else if(score>=70)
				grade='C';
			else if(score>=60)
				grade='D';
			else
				grade='F';
			System.out.printf("점수:%3d\t평가:%c\n", score, grade);
		}//while
		System.out.println("end!");
		sc.close();
	}
}
