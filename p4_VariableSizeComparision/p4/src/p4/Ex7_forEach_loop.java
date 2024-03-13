package p4;/*
for(자료형  변수명 : 1차원의레퍼런스변수명   ) {
   문1;
   문2;
}
*/

public class Ex7_forEach_loop {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};	
		System.out.println("a---");
		for(int  i=0;i<a.length;i++) {	
			System.out.printf("%d\t",a[i]);
		}
		int sum=0;
		for(int  k  :a   ) {
			sum+=k;
			System.out.printf("%d\t",k);// k는 a[0], k 는 a[1]... k는 a[4]
		}
		System.out.printf("\n합 : %d\n",sum);
		String f[] = { "사과", "배", "바나나", "체리", "딸기", "포도" } ;
		for(String s : f) { // s는 f[0], f[1], ..., f[5]로 반복
			System.out.print(s + "\t");
		}

	}

}
