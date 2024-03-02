package p3;/*
10
20
30
40
50
*/
public class Ex9_do_while_Loop {

	public static void main(String[] args) {
		int a=10;//초기치
		do {
			System.out.println(a);
			a+=10;//증감식
		}while( a <=  50   );//조건식
		System.out.println("do ~ while을 벗어나서의 a : "+a);//60
	}
}
/*int a;
for(a=10;a<=50;a+=10) {
	   System.out.println(a);
}//for   
System.out.println("for를 벗어나서의 a : "+a);//60
*/