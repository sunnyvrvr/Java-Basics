package p3;/*
      2단                 3단
------------      ------------
2 X 1 =  2       3 X 1 =  3
...
2 X 9 = 18      3 X 9 = 27
      4단                 5단
------------      ------------
      ...
      6단                 7단
------------      ------------
      ...
      8단                 9단
------------      ------------
...
*/
public class Ex16_timestable2 {
	public static void main(String[] args) {
		String line="----------";
		for(int i=2;i<=9;i+=2) {
			int a=i+1;
			System.out.printf("    %d단\t\t",i);
			System.out.printf("    %d단\n",a);
			System.out.printf("%s\t%s\n",line,line);
		        for(int j=1;j<=9;j++) {
		        	System.out.printf("%d X %d = %2d\t",i,j,i*j);
		        	System.out.printf("%d X %d = %2d\n",a,j,a*j);
		        }//for j
	      System.out.println();     
		}//for i 
	}
}
