package p3;/*
이름? 이 구 영
국어,영어?? 100 95
---------------------------------
이름 : xxx
평균 : xxx.x     평가 : x
	계속하시겠어요(Y/y/N/n)? a
	계속하시겠어요(Y/y/N/n)? t
	계속하시겠어요(Y/y/N/n)? Y
이름? 홍길동
....
	계속하시겠어요(Y/y/N/n)? n
작업을 종료합니다.
*/
import java.util.Scanner;

public class Ex10_GradeProcessing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner tc=new Scanner(System.in);
		String line="---------------------------------";
		char grade='@'; String ch=null;
		while(true) {
			System.out.print("이름? ");String name=sc.nextLine();
			System.out.print("국어점수,영어점수?? ");
			int kor=tc.nextInt();
			int eng=tc.nextInt();		
			double ave=(kor+eng)/2.0;//연산우선순위 : ( )  >   *,/> +,-
				switch( (int)ave/10  ) //(int)99.5-->99, 99/10 -->9
				{
					case 10:
					case 9:grade='A';break;
					case 8:grade='B';break;
					case 7:grade='C';break;
					case 6:grade='D';break;
					default:grade='F';break;
				}//switch
			System.out.println(line);
			System.out.printf("이름 : %s\n",name);
			System.out.printf("평균 : %5.1f\t평가 : %c\n",ave,grade);			
		     do {
				System.out.print("\t계속하시겠어요(Y/N)? ");
				ch=tc.next().toLowerCase();//System.out.println("ch : "+ch);
		     }while( !ch.equals("y") &&  !ch.equals("n")   ) ;// y'n'
		//"y","n"
		     if(ch.equals("n")) break;
		     //"y"
		}//while 
		System.out.println("작업을 종료합니다.");
		sc.close();
		tc.close();
	}
}
