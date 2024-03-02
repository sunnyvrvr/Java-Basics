package p3;/*5명의 기본자료를 입력하여 배열변수에 할당후, 아래처럼!!
#1)
     번호? 11
     이름? 홍 길 동
     국어,영어?? 100 95
#2)
     번호? 12
     이름? 이이
     ....
               *성적표*
번호    이름     국어    영어   총점 
xxx  xxxx   xxx   xxx   xxx
...

*/
import java.util.Scanner;
public class Ex21_GradeProcessing_array {
	static final int size=5;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner tc=new Scanner(System.in);
		int hno[]=new int[size];
		int kor[]=new int[size];int eng[]=new int[size];
		int tot[]=new int[size];
		String name[]=new String[size];
		for(int i=0;i<size;i++) {
			System.out.printf("#%d)\n",i+1);
			System.out.print("   번호? ");hno[i]=sc.nextInt();
			System.out.print("   이름? ");name[i]=tc.nextLine();
			System.out.print("   국어성적,영어성적?? ");kor[i]=sc.nextInt();
			                                                   eng[i]=sc.nextInt();
			 tot[i]=kor[i]+ eng[i];  //총점                                              
		}//for i   		
		System.out.println("\n           *성적표*");
		System.out.println("번호\t이름\t국어\t영어\t총점");
		for(int i=0;i<size;i++) {
			
			System.out.printf("%3d\t%s\t%3d\t%3d\t%3d\n",
	    		hno[i],name[i],kor[i],eng[i],tot[i]);       
		}//for i
		sc.close();
		tc.close();
	}
}
