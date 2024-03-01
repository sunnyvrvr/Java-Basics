package p1;/*
이름 홍 길 동, 시험지유형 b,국어 95, 영어 100을 변수에 할당후, 총점과 평균을 구해 아래처럼!

이름 : xxx	시험지유형 : x
국어 : xxx	영어 : xxx
------------------------
총점 : xxx	평균 : xxx.x
 */

public class Ex13_Grade3 {

	public static void main(String[] args) {
		String line="---------------------------";
		String name=new String("홍 길 동");//== String name="홍 길 동";
		char ty='b';
		int kor=95;
		int eng=100;		

		int tot=kor+eng;			
		float ave=(float)tot/2; //== float ave=tot/2.0f;//  2 : int형 literal, 2.0F, 2.0f  : float형 literal

		System.out.printf("이름 : %s\t시험지유형 : %c\n",name,ty);
		System.out.printf("국어 : %3d\t영어 : %3d\n",kor,eng);
		System.out.println(line);
		System.out.printf("총점 : %3d\t평균 : %5.1f\n",tot,ave);
	}

}
