package p3;/*
      2단
------------
2 X 1 =  2    
2 X 2 =  4
2 X 3 =  6
2 X 4 =  8
2 X 5 = 10
2 X 6 = 12
2 X 7 = 14
2 X 8 = 16
2 X 9 = 18
      3단
------------
3 X 1 =  3    
...
      9단
------------
9 X 1 =  9
...
9 X 9 = 81
빨리변하는 값을 안의 for로!!
*/

public class Ex15_timestable {

	public static void main(String[] args) {
		String line="----------";
		for(int i=2;i<=9;i++) {
			System.out.printf("    %d단\n",i);
			System.out.printf("%s\n",line);
		        for(int j=1;j<=9;j++) {
		        	System.out.printf("%d X %d = %2d\n",i,j,i*j);
		        }//for j
	      System.out.println();     
		}//for i    
	}
}
