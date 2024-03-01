package p2;
/*
이름? 정선진
시험지유형? b
국어, 영어?? 95 100
-------------------
이름: xxx 시험지유형: x
국어: xxx 영어: xxx
총점: xxx 평균: xxx.x 
  */
import java.util.Scanner; 

public class Ex3_GradeProcessing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner tc=new Scanner(System.in);
		String line="------------------";
		while(true) {
		
			System.out.print("이름?");String name=sc.nextLine();
			System.out.print("시험지유형?");String ty=tc.next(); //tc.nextChar()의 메소드는 없음!!
			System.out.print("국어,영어??");int kor=tc.nextInt(); int eng=tc.nextInt();
			
			int tot=kor+eng;
			float ave=tot/2.0F;
			
			System.out.println(line);
			System.out.printf("이름: %s\t시험지유형:%\n",name, ty.toUpperCase());	
			System.out.printf("국어: %s\t영어:%\n",kor, eng);	
			System.out.printf("총점:%3d\t,평균: %5.1f/n",tot, ave);	
		}//while
	}

}

/*String객체.메소드()
  	ty.toUpperCase() -> ty를 대문자열로 변환
  	ty.toLowerCase() -> ty를 소문자열로 변환  	 	
*/
