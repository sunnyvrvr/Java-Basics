package p2;

import java.util.Scanner;

public class Ex13_Sales2 {

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
			String tcode=code.toLowerCase();
			//		System.out.println("tcode:"+ tcode);		
			if(tcode.equals("a")||code.equals("A")) {
				pname="지우개"; dan=700;
			}
			else if(tcode.equals("b")) {
				pname="노트"; dan=3500;
			}
			else if(tcode.equals("c")) {
				pname="연필"; dan=1000;
			}				
			else if(tcode.equals("d")) {
				pname="볼펜"; dan=2500;
			}
			else {
				pname="샤프"; dan=4500;
			}
			int price=su*dan;
			System.out.println(line);
			System.out.printf("코드:%3s\t품명:%s\n", tcode, pname);
			System.out.printf("수량:%3d\t단가:%4d\t금액:%7d\n\n", su, dan, price);	
		}//while
		System.out.println("끝~~~");
		sc.close();
		tc.close();
	}
}
