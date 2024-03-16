package p4;/*5개의 기본자료를 입력하여 배열변수에 할당하고 조건에 따라 처리후, 아래처럼!!
#1번째 data입력 ---> 코드? a
수량? 10
#2번째 data입력 ---> 코드?  B
...
*판매보고서*
코드  품명   수량   단가   금액     
a    ...
B   ...
... 
-------------------------
수량의 총계 : xxxxxxxx
금액의 총계 : xxxxxxxx   
*판매보고서(품명순)*
코드  품명   수량   단가   금액             
B    노트  ...
d    볼펜  ..
..                  
*/
import java.util.Scanner;
public class Ex11_TwoDimensionalArray_sales {
	static final int SIZE=5;	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String line="----------------------------------------";
		 String copn[][]=new String[SIZE][2];		 String tcopn="@@@";
		 int a[][]=new int[SIZE][3];
		 int totsu,totkum,temp;
		 totsu=totkum=temp=0;//할당순서는 우 ---> 좌 	
		 for(int  i=0;i<SIZE;i++) {
		   System.out.printf("#%d번째 data입력 ---> ", i+1);
			System.out.print("코드? ");  copn[i][0]=sc.next();
			System.out.print("\t\t   수량? "); a[i][0]=sc.nextInt();
				switch( copn[i][0].toLowerCase() ) {
					case "a":copn[i][1]="지우개";a[i][1]=700;break;
					case "b":copn[i][1]="노트";a[i][1]=3500;break;
					case "c":copn[i][1]="연필";a[i][1]=1000;break;
					case "d":copn[i][1]="볼펜";a[i][1]=2500;break;
					default:copn[i][1]="샤프";a[i][1]=4500;break;
				}//switch
			a[i][2]=	a[i][0]*a[i][1];
			totsu+=a[i][0];//== totsu=totsu+su[i];
			totkum+=a[i][2];
		 }//for 			 
		System.out.println("\n               *판매보고서*");
		System.out.println("코드\t품명\t    수량\t    단가\t    금액");
		for(int  i=0;i<SIZE;i++) {			
			System.out.printf("%3s\t%s\t",copn[i][0],copn[i][1]);
			for(int j=0;j<a[i].length  ;j++) {
				System.out.printf("%7d\t",a[i][j]);
			}
			System.out.printf("\n");
		}
		System.out.println(line);
		System.out.printf("수량의 총계 : %8d\n",totsu);
	    System.out.printf("금액의 총계 : %8d\n",totkum); 
	    //품명으로 정렬하기
	    for(int i=0; i<SIZE-1 ;i++) {
	    	for(int j=i+1;j<SIZE;j++) {
	    		if(    copn[i][1].compareTo(copn[j][1]) >0        )//"지우개" >  "노트"
	    		{//서로의 값 바꾸기 
	    			tcopn=copn[i][0];  copn[i][0]=copn[j][0]; copn[j][0]=tcopn;//코드
	    			tcopn=copn[i][1];  copn[i][1]=copn[j][1]; copn[j][1]=tcopn;//품명	  	    			
	    			temp=a[i][0];  a[i][0]=a[j][0]; a[j][0]=temp;//수량
	    			temp=a[i][1];  a[i][1]=a[j][1]; a[j][1]=temp;//단가
	    			temp=a[i][2];  a[i][2]=a[j][2]; a[j][2]=temp;//금액
	    		}
	    	}
	    }
	    System.out.println("\n              *판매보고서(품명순)*");
	    System.out.println("코드\t품명\t    수량\t    단가\t    금액");
		for(int  i=0;i<SIZE;i++) {			
			System.out.printf("%3s\t%s\t",copn[i][0],copn[i][1]);
			for(int j=0;j<a[i].length  ;j++) {
				System.out.printf("%7d\t",a[i][j]);
			}
			System.out.printf("\n");
		}
		sc.close();
	}
}
/*
<조건>
코드가 a(A)면 품명은 지우개, 단가 700원
코드가 b(B)면 품명은 노트, 단가 3500원
코드가 c(C)면 품명은 연필, 단가 1000원
코드가 d(D)면 품명은 볼펜, 단가 2500원
그외의 코드면 품명은 샤프, 단가 4500원
금액=수량*단가
*/