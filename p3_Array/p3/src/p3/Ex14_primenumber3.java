package p3;/* 1 ~ 100까지의 수중 소수만 출력
2 3 5 7 ...   97
총 개수 : xx개
*/
public class Ex14_primenumber3 {
	public static void main(String[] args) {		
		int cn=0;
		for(int n=1;n<=100;n++) {			
			boolean sw=false;//나눠보기전 초기치 설정 
			int i;
				for(i=2;i<n;i++)//1과 자신을 제외하고 나눠봄
				{
					if(  n%i==0  ) { sw=true;break;} 				
				}//for 	i		
			if(sw==false && n==i) {
				System.out.printf("%d ",n);
				cn++;//== cn=cn+1;
			}
		}//for n
		System.out.printf("\n총 개수 : %d개\n",cn);
	}
}
