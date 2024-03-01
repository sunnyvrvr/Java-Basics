package p2;
//2장 21
public class Ex6_ExplicitTypeCasting {

	public static void main(String[] args) {
		int n = 300;
		byte b = (byte)n; // int 타입이 byte로 자동 변환 안 됨, -128<=byte<=127
		System.out.println("b:"+b);

		double d = 1.9;
		int m=(int)d;
		System.out.println("m:"+m);	
	}

}
