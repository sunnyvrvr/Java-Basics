package p2;
/*
코드와 수량을 입력받아 변수에 할당후, 조건에 따라 처리후 아래처럼!
코드? a
수량? 10
-------------------------------
코드:a	품명: xxxx
수량:xxx	단가: xxxx 금액: xxxxxx
코드? (입력값 없이 enter key누르면 끝)
끝~~~~
 */
import java.util.Scanner;

public class Ex12_Sales1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner tc=new Scanner(System.in);
		String line="-------------------";
		String pname=null;
		int dan=0;

		while(true) {
			System.out.printf("코드?"); 
			String code=sc.nextLine(); 
			if(code.equals("")) break;
			System.out.printf("수량?"); int su=tc.nextInt();		
			if(code.equals("a")||code.equals("A")) {
				pname="지우개"; dan=700;
			}
			else if(code.equals("b")||code.equals("B")) {
				pname="노트"; dan=3500;
			}
			else if(code.equals("c")||code.equals("C")) {
				pname="연필"; dan=1000;
			}				
			else if(code.equals("d")||code.equals("D")) {
				pname="볼펜"; dan=2500;
			}
			else {
				pname="샤프"; dan=4500;
			}
			int price=su*dan;
			System.out.println(line);
			System.out.printf("코드:%3s\t품명:%s\n", code, pname);
			System.out.printf("수량:%3d\t단가:%4d\t금액:%7d\n\n", su, dan, price);	
		}//while
		System.out.println("끝~~~");
		sc.close();
		tc.close();
	}
}

/* 
<조건>
코드가 a면 품명은 지우개, 단가 700원
코드가 b면 품명은 노트, 단가 3500원
코드가 c면 품명은 연필, 단가 1000원
코드가 d면 품명은 볼펜, 단가 2500원
그외의 코드면 품명은 샤프, 단가 4500원
금액=수량*단기
 */