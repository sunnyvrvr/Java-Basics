package p5;/*3명의 기본값을 입력받아 Sinsang객체를 생성후, 아래처럼!
#1)
     이름? 호 기 연
     나이? 19
     체중? 77.2
#2)
     이름? 이이
     ....
     *신상자료*
이름     나이       체중
xxx    xxx   xxx.x
 ...
*/
import java.util.Scanner;
public class Ex5_SinsangObject {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);Scanner tc=new Scanner(System.in);
		Sinsang p[]=new Sinsang[3];
		for(int i=0;i<p.length;i++) {
			System.out.printf("#%d)\n",i+1);
			System.out.print("   이름? ");String name=sc.nextLine();
			System.out.print("   나이? ");int age=tc.nextInt();
			System.out.print("   체중? ");double weight=tc.nextDouble();
			p[i]=new Sinsang(name,age,weight);//인수있는 생성자 호출
		}
		System.out.println("\n        *신상자료*");
		System.out.println("이름\t\t나이\t  체중");
		for(int i=0;i<p.length;i++) {
			p[i].show();
		}
		sc.close();
		tc.close();
	}
}












