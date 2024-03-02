package p3;/*
10
20
30
40
50
*/
public class Ex7_Whileloop {

	public static void main(String[] args) {
		int a=10;// 초기치 
		while(a<=50)//조건식 
		{
			System.out.println(a);
			a+=10;//증감식
		}//while
		System.out.println("while을 벗어나서의 a : "+a);//60
	}
}
/*
	int a;
	for(a=10;a<=50;a+=10) {
		   System.out.println(a);
	}//for   
	System.out.println("for를 벗어나서의 a : "+a);//60
*/