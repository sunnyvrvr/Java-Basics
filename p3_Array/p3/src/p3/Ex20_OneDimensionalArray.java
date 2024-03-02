package p3;

public class Ex20_OneDimensionalArray {

	public static void main(String[] args) {
		int ia[]=new int[6];//정수형 배열객체 생성 및 선언
		double da[];//실수형 배열객체변수 선언
		da=new double[7];//실수형 배열객체 생성
		char ca[]= {'a','p','p','l','e'};
		String name[]= {"홍 길 동","이이","정 소민","동수"};
		System.out.printf("ia의 배열요소의 갯수 : %d\n",ia.length);//6
		System.out.printf("da의 배열요소의 갯수 : %d\n",da.length);//7
		System.out.printf("ca의 배열요소의 갯수 : %d\n",ca.length);//5
		System.out.println("ia-----");
		for(int i=0;i<ia.length;i++) {
			System.out.printf("ia[%d] : %d\n",i,ia[i]);
		}
		System.out.println();
		System.out.println("da-----");
		for(int i=0;i<da.length;i++) {
			System.out.printf("da[%d] : %f\n",i,da[i]);
		}
		System.out.println();
		System.out.println("ca-----");
		for(int i=0;i<ca.length;i++) {
			System.out.printf("ca[%d] : %c\n",i,ca[i]);
		}
		System.out.println();
		System.out.println("name-----");
		for(int i=0;i<name.length;i++) {
			System.out.printf("name[%d] : %s\n",i,name[i]);
		}
	}

}
