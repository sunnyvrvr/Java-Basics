package p4;/*
11  12
13  14  15  16
17  18 19
20  21
22
*/

public class Ex9_TwoDimensionalArray2 {
	public static void main(String[] args) {
		int ia[][]=new int[5][];
		ia[0]=new int[2];
		ia[1]=new int[4];
		ia[2]=new int[3];
		ia[3]=new int[2];
		ia[4]=new int[1];
		int k=10;
		for(int i=0;i<ia.length  ;i++) {
			for(int j=0;j<ia[i].length   ;j++) {
				k++;
				ia[i][j]=k;
			}
		}
		for(int i=0;i<ia.length  ;i++) {
			for(int j=0;j<ia[i].length   ;j++) {
				//System.out.printf("ia[%d][%d] : %d ",i,j,ia[i][j]);
				System.out.printf("%d ",ia[i][j]);
			}//for j
			System.out.printf("\n");
		}//for i
	}
}
