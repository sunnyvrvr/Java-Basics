package p_review;

public class Ex20_2_DeclareArray2 {

	public static void main(String[] args) {

		int a[] = new int[5]; 	
//		int a[] = {0,1,2,3,4};

		System.out.println(a.length);
		int score[]= {185,200,195,165,170};
		System.out.println(score.length);

		int []test= {1,2,3};
		int []test2;

		test2= test;
		System.out.println(test);	
	}

}
