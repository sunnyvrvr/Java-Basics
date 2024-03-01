package p1;
//산술연산자 : +, -, *, /,%(나머지를 구하는 연산자)
public class Ex2_ArithmeticOperator {

	public static void main(String[] args) {
		System.out.println(10+3);//13
		System.out.println(10-3);//7
		System.out.println(10*3);//30		//
		System.out.println(10/3);//3   몫                1) 정수와 정수의 연산의 결과는 정수		
		System.out.println(10/3.0);//3.3333....   2) 정수와 실수의 연산의 결과는 실수
		System.out.println(10.0/3);//3.3333.... 
		System.out.println(10.0/3.0);
		System.out.println(10%3);//1
	}
}
