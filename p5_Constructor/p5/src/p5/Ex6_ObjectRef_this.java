package p5;/*
this :  1) 객체 자신을 참조하는 레퍼런스== 객체자신의 위치값(==주소)를 가짐
          2) 객체생성시 생성자함수의 body로 들러가는 순간 자동으로 생김
          3) 멤버변수 su == this.su 
*/

public class Ex6_ObjectRef_this {

	public static void main(String[] args) {
		Panmae p=new Panmae('c',"오렌지",100,1200);
		p.disp();
	}
}
class  Panmae{
	private char code;
	private String pname;
	private  int su;
	private  int dan;
	private  int price;
	public Panmae(char code, String pname,int su,int dan){
		//code=_code;//멤버변수=매개변수;
		//code=code;//매개변수=메개변수;
		this.code=code;//멤버변수=매개변수;
		this.pname=pname;
		this.su=su;
		this.dan=dan;				
	}
	public void calc(){		
		this.price=this.su*this.dan;//== price=su*dan;
	}
	public void disp(){
		calc();
		System.out.printf("코드 : %c\n",code); 
		System.out.printf("품명 : %s\n",pname);
		System.out.printf("수량 : %d\n",this.su);
		System.out.printf("단가 : %d\n",dan);
		System.out.printf("금액 : %d\n",price);
	}	
}
