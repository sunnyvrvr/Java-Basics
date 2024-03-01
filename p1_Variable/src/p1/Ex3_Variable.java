package p1;/*
10 + 3 = 13
10 - 3 = 7
...
형) System.out.printf("출력 제어 문자열",대상1,대상2);
*/

public class Ex3_Variable {
	public static void main(String[] args) {
		int a=10,b=3;//int형의 변수 a,b선언 및 초기치 설정 		
		//System.out.println("a : "+a+"\tb : "+b);
		//System.out.println(a+" + "+b+" = "+(a+b));		
		System.out.printf("%d + %d = %2d\n",a,b,a+b);//10진수 13		
		System.out.printf("%d - %d = %2d\n",a,b,a-b);
		System.out.printf("%d * %d = %2d\n\n",a,b,a*b);
		System.out.printf("%d / %d = %2d\n",a,b,a/b);
		System.out.printf("%d / %.1f = %.10f\n",a,(double)b,a/(double)b);
		System.out.printf("%d %% %d = %2d\n",a,b,a%b);
	//	%자체의 출력을 위해 %%
	}
}
/*
System.out.printf("%d + %d = %o\n",a,b,a+b);// 8진수 15
System.out.printf("%d + %d = %x\n",a,b,a+b);//16진수 d
System.out.printf("%d + %d = %X\n",a,b,a+b);//16진수 D
*/