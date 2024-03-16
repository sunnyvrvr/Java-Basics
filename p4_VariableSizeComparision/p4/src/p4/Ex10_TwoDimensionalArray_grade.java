package p4;/*5명의 기본자료를 입력하여 배열변수에 할당후, 아래처럼!!
#1)
번호? 11
이름? 홍 길 동
국어,영어?? 100 95
#2)
번호? 12
이름? 이이
....
                           *성적표*
번호    이름     국어     영어     총점       평균    평가   등수
xxx  xxxx   xxx   xxx   xxx    xxx.x       x     x
...
----------------------------------------------------
국어 최고점수 : xxx
영어 최저점수 : xxx
                        *성적표(등수순)*
번호    이름     국어     영어     총점       평균    평가   등수
xxx  xxxx   xxx   xxx   xxx    xxx.x       x     1
...
*/

import java.util.Scanner;

public class Ex10_TwoDimensionalArray_grade {
	static final int size=5;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner tc=new Scanner(System.in);
		String line="-------------------------------------------------------------------";
		int a[][]=new int[size][5];	int temp=0;
		float ave[]=new float[size];  float tave=0.0F;
		char grade[]=new char[size]; char tgrade='@';
		String name[]=new String[size];	String tname="@@@";	
		for(int i=0;i<size;i++) {
			System.out.printf("#%d)\n",i+1);
			System.out.print("   번호? ");a[i][0]=sc.nextInt();
			System.out.print("   이름? ");name[i]=tc.nextLine();
			System.out.print("   국어,영어?? ");a[i][1]=sc.nextInt();			
			                                                   a[i][2]=sc.nextInt();
			 a[i][3]=a[i][1]+ a[i][2];  //총점      
			 ave[i]=a[i][3]/2.0F;
				 switch(   (int)ave[i]/10   ) //(int)97.5f-->97, 97/10--> 9
				 {
				 case 10:
				 case 9:grade[i]='A';break;
				 case 8:grade[i]='B';break;
				 case 7:grade[i]='C';break;
				 case 6:grade[i]='D';break;
				 default:grade[i]='F';break;
				 }//switch		  
		}//for i  	
		//최대, 최소 구하기
		int maxkor=a[0][1]; 
		int mineng=a[0][2];
		for(int i=1;i<size;i++) {
			if(maxkor < a[i][1])	maxkor=a[i][1];	 
			if(mineng >a[i][2])	mineng=a[i][2];
		}
		//5명의 총점이 결정된 후 등수구하기
		for(int i=0;i<size ;i++) {
			a[i][4]=1;//비교전 1등의 초기치 
			for(int j=0;j<size;j++) {
				if(a[i][3] < a[j][3]) a[i][4]++;
			}
		}
		System.out.println("\n                             *성적표*");
		System.out.println("번호\t이름\t\t국어\t영어\t총점\t  평균\t평가\t등수");
		for(int i=0;i<size;i++) {			
			System.out.printf("%3d\t%-12s\t",a[i][0],name[i]);  
			for(int j=1;j<size-1;j++) {
				System.out.printf("%3d\t",a[i][j]);
			}     
			System.out.printf("%5.1f\t%3c\t%3d\n",ave[i],grade[i],a[i][4]);       
		}//for i
		System.out.println(line);
		System.out.printf("국어 최고점수 : %3d\n",maxkor);
		System.out.printf("영어 최저점수 : %3d\n",mineng);
		//등수로 정렬하기
		for(int i=0;i<size-1 ;i++) {
			for(int j=i+1;j<size;j++) {
				if(a[i][4]  >a[j][4]) //5 >  1
				{//서로의 값 바꾸기 
					tname=name[i];  name[i]=name[j];  name[j]=tname;
					tave=ave[i];               ave[i]=ave[j];				ave[j]=tave;
					tgrade=grade[i];    grade[i]=grade[j];			grade[j]=tgrade;	
					for(int k=0;k<a[i].length;k++) {
						temp=a[i][k];				a[i][k]=a[j][k];			a[j][k]=temp;		
					}//for k				
				}//if
			}//for j
		}//for i		
		System.out.println("\n                          *성적표(등수순)*");
		System.out.println("번호\t이름\t\t국어\t영어\t총점\t  평균\t평가\t등수");
		for(int i=0;i<size;i++) {			
			System.out.printf("%3d\t%-12s\t",a[i][0],name[i]);  
			for(int j=1;j<size-1;j++) {
				System.out.printf("%3d\t",a[i][j]);
			}     
			System.out.printf("%5.1f\t%3c\t%3d\n",ave[i],grade[i],a[i][4]);       
		}//for i		
		sc.close();
		tc.close();
	}
}
/*temp=a[i][0];				a[i][0]=a[j][0];			a[j][0]=temp;		
temp=a[i][1];				a[i][1]=a[j][1];			a[j][1]=temp;		
temp=a[i][2];				a[i][2]=a[j][2];			a[j][2]=temp;		
temp=a[i][3];				a[i][3]=a[j][3];			a[j][3]=temp;		
temp=a[i][4];				a[i][4]=a[j][4];			a[j][4]=temp;	  대신 87반복문 for(k...)*/					