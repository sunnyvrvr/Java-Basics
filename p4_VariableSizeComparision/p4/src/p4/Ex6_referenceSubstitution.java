package p4;

public class Ex6_referenceSubstitution {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};		
		int ra[]=a;// 레퍼런스의_치환으로 ra라는 이름으로 a의 배열을 공유하게 됨
		System.out.println("a---");
		for(int  i=0;i<a.length;i++) {	
			System.out.printf("a[%d] : %d\n",i,a[i]);
		}
		System.out.println("ra---");
		for(int  i=0;i<ra.length;i++) {	
			System.out.printf("ra[%d] : %d\n",i,ra[i]);
		}
		ra[2]=100;
		System.out.println("a---");
		for(int  i=0;i<a.length;i++) {	
			System.out.printf("a[%d] : %d\n",i,a[i]);
		}
		System.out.println("ra---");
		for(int  i=0;i<ra.length;i++) {	
			System.out.printf("ra[%d] : %d\n",i,ra[i]);
		}
	}

}
