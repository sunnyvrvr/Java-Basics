package p4;/*배열에 기본값 할당후, 출력은 사용자함수[  show    ]에서 하고,
오름차순 정렬도 사용자함수[  ascSort   ]에서 함!
원래---
111	23	67	91	75
오름차순 정렬후--
23	67	75	91	111
*/
public class Ex14_ReferenceType_sort {
	static void show(int ra[]) {
    	for(int i=0;i<ra.length;i++) {
			System.out.printf("%3d\t",ra[i]);
		}
		System.out.printf("\n");
    }
	static void ascSort(int a[]){
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
	}
	public static void main(String[] args) {
		int a[]= {111,23,67,91,75};
		System.out.println("원래---");
		 show(a);	
		 ascSort(a);	
		System.out.println("오름차순 정렬후---");
		 show(a);	
	}
}
