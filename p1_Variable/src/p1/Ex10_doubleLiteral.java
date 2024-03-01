package p1;

public class Ex10_doubleLiteral {

	public static void main(String[] args) {
		/*double d = 0.1234;
		double e = 1234E-4; // 1234E-4 --> 1234x10의-4승이므로 0.1234와 동일
		System.out.println("d : "+d);
		System.out.println("e : "+e);
		*/
		float f = 0.1234F;
		//double w = .1234; // .1234D == .1234 == 0.1234는 동일
		double w = .1234D;
		System.out.println("f : "+f);
		System.out.println("w : "+w);
	}

}
