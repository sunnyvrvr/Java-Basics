package p2;

import java.util.Scanner;

public class Ex11_ScoreGrade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char grade='@';
		while(true) {
			System.out.print("점수?"); int score=sc.nextInt();

			if(score==999) break;
			if(!(score>=0 && score<=100)) {	
				System.out.print("\t점수의 입력범위[0~100]오류...다시");
				continue;
			}//while의 조건식으로 분기

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
			System.out.printf("점수:%3d\t평가:%c\n",score,grade);
		}//while
		System.out.println("end!");
		sc.close();

	}

}
/*		if(score<0||score>100) {
System.out.print("\t점수의 입력범위[0~100]오류...다시");
continue;//while
}
 */	