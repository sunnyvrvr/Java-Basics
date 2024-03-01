package p1;/*
국어 95, 영어 100을 변수에 할당후, 총점과 평균을 구해 아래처럼!
국어 : xxx	영어 : xxx
-----------------------
총점 : xxx	평균 : xxx.x
*/
public class Ex4_Grade {

	public static void main(String[] args) {
		int kor=95,eng=100;
		int tot=kor+eng;
		double ave=tot/2.0;//  2 : int형 literal, 2.0 : double형 literal
		
		System.out.printf("국어 : %3d\t영어 : %3d\n",kor,eng);
		System.out.println("--------------------------");
		System.out.printf("총점 : %3d\t평균 : %5.1f\n",tot,ave);
		System.out.println(ave);
	}

}
