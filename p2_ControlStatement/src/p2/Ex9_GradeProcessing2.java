package p2; /*비고는 평균이 85이상이면 집으로, 그외에는 면담요망의 문자열을 출력
이름, 시험지유형, 국어, 영어를 입력하여 변수에 할당후, 아래처럼!!
이름? 홍 길 동
시험지 유형? b
국어, 영어 ?? 95, 100
-----------------------
이름: xxx 	시험지유형: b



이름? (입력없이 enter key 누르면 종료)
작업을 종료합니다
*/
import java.util.Scanner;
public class Ex9_GradeProcessing2 {
	public static void main(String[] args) {
		java.util.Scanner sc=new Scanner(System.in);
		java.util.Scanner tc=new Scanner(System.in);		
		String line="-------------------------";
		String bigo = null;
		while(true) {
			System.out.print("이름?"); String name=sc.nextLine();
			if(name.equals("정 선 진")) break;
//	if(name=="정 선 진") break;
			System.out.print("시험지유형"); String ty=tc.next();
			System.out.print("국어,영어??"); int kor=tc.nextInt(); int eng=tc.nextInt();

		int tot=kor+eng;
		float ave=tot/2.0F;
		bigo=(ave>=85)? "집으로..": "면담요망!";
		
		System.out.println(line);
		System.out.printf("이름: %s\t시험지유형: %s\n",name,ty.toUpperCase());		
		System.out.printf("국어: %3d\t영어:%3d\n",kor,eng);
		System.out.printf("총점: %3d\t평균:%5.1f\n", tot, ave);
		System.out.printf("이름: %s\n\n", bigo);
		}
	System.out.println("작업을 종료합니다");	
	sc.close();
	tc.close();
	}
}

