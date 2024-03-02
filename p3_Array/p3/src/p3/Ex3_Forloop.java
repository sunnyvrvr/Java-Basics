package p3;/*
10
20
30
40
50
for(초기치;조건식;증감식){
   문1;
   문2;
}
*/
public class Ex3_Forloop {
	public static void main(String[] args) {
       int a;
       for(a=10;a<=50;a+=10) {
    	   System.out.println(a);
       }//for   
       System.out.println("for를 벗어나서의 a : "+a);//60
	}
}




