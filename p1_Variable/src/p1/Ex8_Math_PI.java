package p1;/**반지름 5를 변수에 할당후, 원의넓이와 둘레를 구해 아래처럼!
반지름 : 5
원의넓이 : xxx.xxxx
원의둘레 : xxx.xxxx
*/
public class Ex8_Math_PI {

	public static void main(String[] args) {
		    int r=5; 	
		                    //Math.PI : 클래스명.멤버
		   double area=r*r*Math.PI;		
		   double dul=2*r*Math.PI;	
		   
			System.out.printf("반지름 : %d\n",r);
			System.out.printf("원의넓이 : %.4f\n",area);
			System.out.printf("원의둘레 : %.4f\n",dul);
			
			System.out.println("Math.PI : "+Math.PI);//3.141592653589793
	}

}
