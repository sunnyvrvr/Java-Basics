package p1;
public class Ex15_Datatype {

	public static void main(String[] args) {
		byte b;
		b = 127;
		//		b = 128;

		System.out.println(1); //컴파일러가 1를 int로 이해
		System.out.println(123.4); //컴파일러가 123.4를 double로 이해

		long lon = 12345546346346L;
		float f = 123.4F;

		char c = '가';  // 'A'는 십진수65로 이해, 'a'는 십진수 97로 이해
		c = '@';
		boolean flag = true;
		flag = false;
		//flag = -1;

		//형변환 
		lon = b; //byte -> long 자동형변환
		System.out.println(lon); //127

		lon = (long)f; //float->long자동형변환 안됨. 강제형변환 (자료형)대입할값
		System.out.println(lon); //123

		lon = c; //char타입은 int자료형으로 자동형변환 가능
		System.out.println(lon); //c: 가, lon: 12927
		short sh;
		//sh = c;

		//boolean 자료형과는 형변환 불가
		//flag = b ;
		//flag = boolen(b);

		byte result = 10 + 20; //ok: 컴파일시 연산
		byte aa,bb;
		aa= 10; bb=20;
		//result = a+b; //컴파일 오류: 실행시 연산
		result = (byte)(aa+bb); //ok : 실행시 연산
	}

}
