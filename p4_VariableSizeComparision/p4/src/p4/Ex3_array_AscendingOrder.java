package p4;/*
원래---
111	23	67	91	75
오름차순 정렬후--
23	67	75	91	111
 */

public class Ex3_array_AscendingOrder {

	public static void main(String[] args) {
		int a[]= {111,23,67,91,75};
		System.out.println("원래---");
		for(int i=0;i<a.length;i++) {
			System.out.printf("%3d\t",a[i]);
		}
		System.out.printf("\n");
		//오름차순 정렬하기
		int temp;
		for(int i=0;i<a.length-1; i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] >  a[j])//111>    23
				{//서로의 값 바꾸기 
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}//if
			}//for j
		}//for i
		System.out.println("오름차순 정렬후---");
		for(int i=0;i<a.length;i++) {
			System.out.printf("%3d\t",a[i]);
		}
		System.out.printf("\n");
		String name[]= {"홍 길 동","강감찬","이 순신","연개소문","권율","임 경 업"};
		System.out.println("원래---");
		for(int i=0;i<name.length;i++) {
			System.out.printf("%s\t",name[i]);
		}
		System.out.printf("\n");
		String tname=null;
		for(int i=0;i<name.length-1; i++) {
			for(int j=i+1;j<name.length;j++) {				
				if( name[i].compareTo(name[j]) >0  )//"홍 길 동"> "강감찬"
				{//서로의 값 바꾸기 					
					tname=name[i];
					name[i]=name[j];
					name[j]=tname;
				}//if
			}//for j
		}//for i
		System.out.println("오름차순 정렬후---");
		for(int i=0;i<name.length;i++) {
			System.out.printf("%s\t",name[i]);
		}
		System.out.printf("\n");
		/*문자열의 크기비교
		System.out.println("홍 길 동".compareTo("강감찬"));//10808
		System.out.println("강감찬".compareTo("홍 길 동"));//-10808
		System.out.println("강감찬".compareTo("강감찬"));//0
		 */
	}

}
