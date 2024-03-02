package p3;/*증감연산자 : ++, --

*/

public class Ex2_IncreaseDecreaseOperator {

	public static void main(String[] args) {
	  int a=50, b=70,s=100,t=200;
      //변수 단독으로 온 경우 : 전위와 후위의 연산의 결과는 같다.
	  a++;//++a;
	  b--;//--b;
	  System.out.printf("a : %d\tb : %d\n",a,b);//51   69
	  System.out.println("다른식과 같이 온경우");
	  System.out.println("\ti) 전위 : 먼저 자신이 증감후 연산에 참여!!");
	  s=s+ ++a;//먼저 a가1증가(52), s(100)+a(52) ---> s(152)
	  System.out.printf("a : %d\ts : %d\n",a,s);//52    152
	  t=t+ --b;//먼저 b가 1감소(68), t(200)+b(68)-->t(268)
	  System.out.printf("b : %d\tt : %d\n",b,t);//68    268
	  System.out.println("\n\tii) 후위 : 먼저 연산후 결과를 넘김, 최종순서에 자신이 증감!!"); 
	  s=s+a++;//먼저 s(152)+a(52) --> s(204),최종순서에 a가 1증가(53)
	  System.out.printf("a : %d\ts : %d\n",a,s);//53    204
	  t=t+b--;//먼저 t(268)+b(68)  --> t(336), 최종순서에 b가 1감소 (67)
	  System.out.printf("b : %d\tt : %d\n\n",b,t);//67    336
	  System.out.printf("a : %d\n",++a);//54
	  System.out.printf("b : %d\n",b--);//먼저 b(67)출력후 b가 1감소
	  System.out.printf("b : %d\n",b);//66
	}
}




