package p1;
//2장ppt12
public class Ex9_intLiteral {

	public static void main(String[] args) {
		/*int n = 15;
		int m = 015;// 8진수 0수
		int k = 0x15;//16진수n 0x수
		int b = 0b0101;//2진수 0b수
		System.out.println("n : "+n);
		System.out.println("m : "+m);//13
		System.out.println("k : "+k);//21
		System.out.println("b : "+b);//5
		*/
		long g = 24;//자동형변환 int literal 24가 g에 할당시 long형으로 자동 변환
		System.out.println("g : "+g);
		long g1 = 2147483648L;  //  -2147483648<= int<=2147483647
		System.out.println("g1 : "+g1);
	}

}
