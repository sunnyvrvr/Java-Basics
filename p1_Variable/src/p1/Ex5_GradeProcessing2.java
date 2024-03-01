package p1;

public class Ex5_Grade2 {

	public static void main(String[] args) {
		//기본값 할당 
		int kor=95,eng=100;		//지역변수 kor,eng
		//처리
		int tot=kor+eng;			
		float ave=(float)tot/2; //== float ave=tot/2.0f;//  2 : int형 literal, 2.0F, 2.0f  : float형 literal
		//출력
		System.out.printf("국어 : %3d\t영어 : %3d\n",kor,eng);
		System.out.println("--------------------------");
		System.out.printf("총점 : %3d\t평균 : %5.1f\n",tot,ave);
		//System.out.println(ave);
	}

}
