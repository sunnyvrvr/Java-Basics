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

public class Ex5_tempVariable_array {
	static final int SIZE=5;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String line="----------------------------------------";
		 String code[]=new String[SIZE];String pname[]=new String[SIZE];
		 String tcopn="@@@";
		 int su[]=new int[SIZE]; int dan[]=new int[SIZE]; int kum[]=new int[SIZE];
		 int totsu,totkum,temp;
		 totsu=totkum=temp=0;//할당순서는 우 ---> 좌 
		 // totsu=0;totkum=0;
		 for(int  i=0;i<SIZE;i++) {
		   System.out.printf("#%d번째 data입력 ---> ", i+1);
			System.out.print("코드? ");  code[i]=sc.next();
			System.out.print("\t\t   수량? "); su[i]=sc.nextInt();
				switch( code[i].toLowerCase() ) {
					case "a":pname[i]="지우개";dan[i]=700;break;
					case "b":pname[i]="노트";dan[i]=3500;break;
					case "c":pname[i]="연필";dan[i]=1000;break;
					case "d":pname[i]="볼펜";dan[i]=2500;break;
					default:pname[i]="샤프";dan[i]=4500;break;
				}//switch
			kum[i]=	su[i]*dan[i];
			totsu+=su[i];//== totsu=totsu+su[i];
			totkum+=kum[i];
		 }//for 			 
		System.out.println("\n              *판매보고서*");
		System.out.println("코드\t품명\t수량\t 단가\t   금액");
		for(int  i=0;i<SIZE;i++) {			
			System.out.printf("%3s\t%s\t%3d\t%4d\t%7d\n",code[i],pname[i],su[i],dan[i],kum[i]);
		}
		System.out.println(line);
		System.out.printf("수량의 총계 : %8d\n",totsu);
	    System.out.printf("금액의 총계 : %8d\n",totkum); 
	    //품명으로 정렬하기
	    for(int i=0; i<SIZE-1 ;i++) {
	    	for(int j=i+1;j<SIZE;j++) {
	    		if(    pname[i].compareTo(pname[j]) >0        )//"지우개" >  "노트"
	    		{//서로의 값 바꾸기 
	    			tcopn=code[i];  code[i]=code[j]; code[j]=tcopn;
	    			tcopn=pname[i];  pname[i]=pname[j]; pname[j]=tcopn;
	    			temp=su[i];  su[i]=su[j]; su[j]=temp;
	    			temp=dan[i]; dan[i]=dan[j]; dan[j]=temp;
	    			temp=kum[i]; kum[i]=kum[j]; kum[j]=temp;
	    		}
	    	}
	    }
	    System.out.println("\n              *판매보고서(품명순)*");
		System.out.println("코드\t품명\t수량\t 단가\t   금액");
		for(int  i=0;i<SIZE;i++) {			
			System.out.printf("%3s\t%s\t%3d\t%4d\t%7d\n",code[i],pname[i],su[i],dan[i],kum[i]);
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