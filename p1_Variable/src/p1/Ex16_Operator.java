package p1;

public class Ex16_Operator {

	public static void main(String[] args) {
		int a,b,c;
		//산술연산 +,-,*,/,%=모듈러연산자
		a = 3;
		b = 5;
		c = a+b;
		System.out.println(c);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(b/a);	
		System.out.println(a%b);
		System.out.println(b%a);	

		System.out.println(a+b*c);//*연산먼저처리
		System.out.println(a+b-c);//*연산우선순위가 같은 경우에는 왼쪽에서 오른쪽으로 연산처리 
		/*		System.out.println(a/0);ArithmeticException*/

		short sa, sb, sc;
		sa=3;
		sb=5;		
		//		sc=sa+sb;
		//sa, sb값이 int로 자동형변환
		// short타입인 sc에 대입되려면 sa+sb결과가 short타입으로 강제형변환 필요***
		sc=(short)(sa+sb);
		System.out.println(sc);


		//비교연산  >,  <,   >=,   <=, ==,!=
		// 		 초과, 미만, 이상, 이하

		a=3;
		b=5;
		System.out.println(a>b);//false 
		System.out.println(a<b);	
		System.out.println(a==b);		
		System.out.println(a!=b);

		//대입연산자 =, +=, -=, *=, /=, %=
		a=3;
		b=5;	
		//		a+=3;	a값에 1증가하여 a에 대입 a=a+1; 과 같음
		a-=3;	//a값에 1감소하여 a에 대입
		b-=2;	//a값에 1감소하여 a에 대입
		System.out.println(a);
		System.out.println(b);

		a-=2;	//a값에 2감소하여 a에 대입 a=a-2와 같음
		a*=3;	
		a/=4;	
		a%=5;		

		//단항연산자=증감연산자 ++, --
		c=3;
		c++;
		System.out.println(c);

		byte by;//-128~+127  메모리를 1byte만 사용함
		by = 127;
		//		by = by+1;	//Type mismatch: cannot convert from int to byte
		by = (byte)(by+1);
		System.out.println(by);	//최소값으로 돌아감: 메모리를 1byte밖에 사용못함

		by = 127;
		by += 1;		
		System.out.println(by);		

		by = 127;
		by ++;		
		System.out.println(by);	

		//삼항연산자 ? :
		a=3;
		String result =	a%2==0?	"짝수":"홀수";
		System.out.println(result);		

		//논리연산자 &, |, &&, ||, ! 
		// & : T&T
		a=3;
		b=5;
		System.out.println("-------&연산---------");

		System.out.println(a < b & a % 2 == 1);
		System.out.println(a > b & a % 2 == 1);	
		System.out.println(a < b & a % 2 != 1);
		System.out.println(a > b & a % 2 != 1);	

		System.out.println("-------&&연산--------");	
		//&& : 왼쪽이 FALSE이면 오른쪽은 결과에 반영하지 않고 처리함 ||도 동일함
		// short-circuit operator
		//속도가 빠름 
		System.out.println(a < b && a % 2 == 1);
		System.out.println(a > b && a % 2 == 1);	
		System.out.println(a < b && a % 2 != 1);
		System.out.println(a > b && a % 2 != 1);	

		System.out.println("-------|연산---------");	

		System.out.println(a < b | a % 2 == 1);
		System.out.println(a > b | a % 2 == 1);	
		System.out.println(a < b | a % 2 != 1);
		System.out.println(a > b | a % 2 != 1);	

		System.out.println("-------||연산--------");	
		// short-circuit operator :  결과는 동일함
		System.out.println(a < b || a % 2 == 1);
		System.out.println(a > b || a % 2 == 1);	
		System.out.println(a < b || a % 2 != 1);
		System.out.println(a > b || a % 2 != 1);

		System.out.println("-------!연산---------");	
		System.out.println(a < b);		
		System.out.println(!(a < b));

		//연산우선순위높이기 : ( )
		//비트연산자 
		a=1;
		b=1;		
		System.out.println(a & b);	//비트연산: int & int   
		System.out.println(a | b);	//비트연산: int | int 
		System.out.println(a < b & a % 2 == 1); //boolean & boolean 논리연산												//논리연산자 
		System.out.println(a < b | a % 2 == 1); //boolean & boolean 논리연산
	}

}
