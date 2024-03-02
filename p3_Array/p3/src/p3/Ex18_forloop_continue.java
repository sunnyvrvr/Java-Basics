package p3;/*100 ~ 200까지의 수중 7의 배수가 아닌수의 합을 구하면?
for에서 continue :continue를 만나면 continue이하는 실행하지 않고,
               for의 증감식으로 분기
*/
public class Ex18_forloop_continue {

	public static void main(String[] args) {
	int s=0;
	  for(int i=100;i<=200;i++) {
		  if(  i%7 == 0  ) continue;
		  //System.out.printf("%d ",i);
		  s+=i;		
	  }//for i
	  System.out.printf("7의 배수가 아닌수의 합 : %d\n",s);//13043
	}
}
/*
int s=0;
for(int i=100;i<=200;i++) {
	  if(  i%7 != 0  ) {
		  //System.out.printf("%d ",i);
		  s+=i;
	  }//if
}//for i
System.out.printf("7의 배수가 아닌수의 합 : %d\n",s);//13043
*/