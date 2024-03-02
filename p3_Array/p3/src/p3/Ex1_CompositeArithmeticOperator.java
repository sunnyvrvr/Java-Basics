package p3;/*복합산술연산자 : +=, -=, *=, /=, %=
1) a += 3;   ==  a=a+3;
2) a-=10;    == a=a-10;
3) a*=2;     ==  a=a*2;
4) a/=5;     ==  a=a/5;
5) a%=4;   == a=a%4;
*/

public class Ex1_CompositeArithmeticOperator {

	public static void main(String[] args) {
		int a=50;
		a+=3;//   ==   a=a+3;// == 현a=옛a+3;
		System.out.printf("a : %d\n",a);//53
		a-=10;  //  == a=a-10;
		System.out.printf("a : %d\n",a);//43
		a*=2;  //   ==  a=a*2;
		System.out.printf("a : %d\n",a);//86
		a/=5;    // ==  a=a/5;
		System.out.printf("a : %d\n",a);//17
		a%=4;  // == a=a%4;
		System.out.printf("a : %d\n",a);//1
	}
}
