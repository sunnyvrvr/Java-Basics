package p4;

public class Ex8_TwoDimensionalArray {

	public static void main(String[] args) {
		int ia[][]=new int[2][5];
		System.out.println("ia배열의 전체 행의 갯수 : "+ia.length);//2
		System.out.println("ia배열의 0번 행의 열의 갯수 : "+ia[0].length);//5
		System.out.println("ia배열의 1번 행의 열의 갯수 : "+ia[1].length);//5
		//3장 ppt29
		int iA[][] = { { 0, 1, 2},  { 3, 4, 5}, { 6, 7, 8} }; 	// 3x3 배열 생성
		System.out.println("iA--");
	    for(int i=0;i<iA.length;i++)	    {
	    	for(int j=0;j<iA[i].length;j++ ) {
	    		System.out.printf("iA[%d][%d] : %d ",i,j,iA[i][j]);
	    	}//for j
	    	System.out.println();
	    }//for i
		char cA[][] = { {'a', 'b', 'c'}, {'d', 'e', 'f'} }; 	// 2x3 배열 생성
		System.out.println("cA--");
	    for(int i=0;i<cA.length;i++)	    {
	    	for(int j=0;j<cA[i].length;j++ ) {
	    		System.out.printf("cA[%d][%d] : %c ",i,j,cA[i][j]);
	    	}//for j
	    	System.out.println();
	    }//for i
		double dA[][] = { {0.01, 0.02}, {0.03, 0.04} }; // 2x2 배열 생성
		System.out.println("dA--");
	    for(int i=0;i<dA.length;i++)	    {
	    	for(int j=0;j<dA[i].length;j++ ) {
	    		System.out.printf("dA[%d][%d] : %.2f ",i,j,dA[i][j]);
	    	}//for j
	    	System.out.println();
	    }//for i
	}
}
