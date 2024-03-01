package p1;/*반지름 5를 변수에 할당후, 원의넓이와 둘레를 구해 아래처럼!(단 파이는3.1415927로 하기로 함)
반지름 : 5
원의넓이 : xxx.xxxx
원의둘레 : xxx.xxxx
 */
//2장ppt17
public class Ex7_FinalDoublePI {
	static final double PI=3.1415927;//final상수 PI

	public static void main(String[] args) {
		int r=5; 

		double area=r*r*PI;
		//PI=3.14;//error final상수 PI는 변경불가!!
		double dul=2*r*PI;		   
		System.out.printf("반지름 : %d\n",r);
		System.out.printf("원의넓이 : %.4f\n",area);
		System.out.printf("원의둘레 : %.4f\n",dul);
		//System.out.println(area);
		System.out.println(dul);
		System.out.println(Math.PI);//3.141592653589793
	}

}
