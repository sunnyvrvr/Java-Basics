package p1;/*반지름 5를 변수에 할당후, 원의넓이와 둘레를 구해 아래처럼!(단 파이는3.1415927로 하기로 함)
반지름 : 5
원의넓이 : xxx.xxxx
원의둘레 : xxx.xxxx
*/
public class Ex6_GrobalVariablePI {
	static double PI=3.1415927;//전역변수 PI
  //사용자함수 
	public static void main(String[] args) {		
       int r=5;
       
       
	   double area=r*r*PI;
	  // PI=3.14;
	   double dul=2*r*PI;
	   
		System.out.printf("반지름 : %d\n",r);
		System.out.printf("원의넓이 : %.4f\n",area);
		System.out.printf("원의둘레 : %.4f\n",dul);
		//System.out.println(area);
		System.out.println(dul);
	}

}
