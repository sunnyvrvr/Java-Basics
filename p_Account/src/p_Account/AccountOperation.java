package p_Account;
import java.util.Scanner;
public class AccountOperation {
	static Scanner sc=new Scanner(System.in);//전역의 스캐너 객체  생성
	static Scanner tc=new Scanner(System.in);
	static Account p[]=new Account[10];//전역의 객체배열 생성 및 선언   
	static int inx=0;//전역의 첨자변수 선언   
	static void menu(){
		System.out.println("\n  --메뉴--");System.out.println("1. 계좌개설");
		System.out.println("2. 입금");System.out.println("3. 출금");
		System.out.println("4. 계좌조회");System.out.println("5. 전체 계좌조회");
		System.out.println("6. 작업종료\n");
	}	
	static void makeAccid(){		
		System.out.println("#계좌개설 작업입니다.");
		boolean sw;
		String accId=null;
		do{
			System.out.print("계좌번호? ");
			accId=sc.next();//"22-22"
			sw=false;//중복체크전 초기치  
			for(int i=0;i<inx;i++) {
				if(   accId.equals( p[i].getAccid() )   ) {
					System.out.print("\t중복계좌임 ... 다시 ");
					sw=true;
					break;
				}//if
			}//for i					
		}while( sw );
		System.out.print("고 객 명? "); String cusName=tc.nextLine();
		System.out.print("개설금액? ");long money=sc.nextLong();
		p[inx]=new Account(accId, cusName, money);// Account객체 생성 
		//p[inx].disp();
		//System.out.println("inx : "+inx);//p[0],p[1],p[2]
		inx++;//3
		System.out.println("#계좌개설 작업을 완료합니다.");
	}
	static void all_Inq(){
		System.out.println("#전체 계좌조회 작업입니다.");
		if(inx==0) {
			System.out.println("\t개설 계좌존재하지 X... #전체 계좌조회 작업불가!!!");
			return;//all_Inq() 함수의 호출위치로 복귀!! 
		}		
		for(int i=0;i<inx;i++) {
			p[i].disp();
		}
		System.out.println("#전체 계좌조회 작업을 완료합니다.");
	}
	static void one_Inq(){
		System.out.println("#계좌조회 작업입니다.");
		if(inx==0) {
			System.out.println("\t개설 계좌존재하지 X... #계좌조회 작업불가!!!");
			return;//one_Inq() 함수의 호출위치로 복귀!! 
		}	
		System.out.print("조회 계좌번호? ");String accId=sc.next();
		int i;
		boolean sw=false;//찾아보기전 초기치 설정 
		for(i=0;i<inx;i++) {
			if( accId.equals(p[i].getAccid() ) ) {sw=true; break;}
		}
		if(!sw)// == if(sw==false)
		{
			System.out.println("\t조회 계좌는 존재하지 X");
			return;
		}
		else 
			p[i].disp();
		System.out.println("#계좌조회 작업을 완료합니다.");
	}
	static void deposit(){
		System.out.println("#입금 작업입니다.");
		if(inx==0) {
			System.out.println("\t개설 계좌존재하지 X... #입금 작업불가!!!");
			return;//deposit() 함수의 호출위치로 복귀!! 
		}	
		boolean tw = false;
		long money = 0L;
		while(true) {
			System.out.print("입금 계좌번호? "); String accid=sc.next();
			if(tw==false) {
				System.out.print("    입금액? ");
				money=sc.nextLong();
			}
			int i;
			boolean sw=false;//입금계좌 찾아보기전 초기치 
			for(i=0;i<inx;i++) {
				if( accid.equals(  p[i].getAccid() )  ) {sw=true;break;}
			}//for
			if(sw==false) {
				System.out.print("\t입금 계좌존재하지 X... # 다시 ");
				tw=true;
				continue;//while에서 continue를 만나면 while의 조건식으로 올라감!!
			}
			else {//입금계좌 있음			
				p[i].addMoney(money);
				System.out.printf("\t입금후 잔액 : %d원\n",p[i].getBalance());
				break;
			}			
		}//while 
		System.out.println("#입금 작업을 완료합니다.");
	}
	static void withdraw() {
		System.out.println("#출금 작업입니다.");
		if(inx==0) {
			System.out.println("\t개설 계좌존재하지 X... #출금 작업불가!!!");
			return;//withdraw() 함수의 호출위치로 복귀!! 
		}	
		boolean tw = false;
		long money = 0L;
		while(true) {
			System.out.print("출금 계좌번호? "); String accid=sc.next();
			if(tw==false) {
				System.out.print("    출금액? ");
				money=sc.nextLong();
			}
			int i;
			boolean sw=false;//출금계좌 찾아보기전 초기치 
			for(i=0;i<inx;i++) {
				if( accid.equals(  p[i].getAccid() )  ) {sw=true;break;}
			}//for
			if(sw==false) {
				System.out.print("\t출금 계좌존재하지 X... # 다시 ");
				tw=true;
				continue;//while에서 continue를 만나면 while의 조건식으로 올라감!!
			}
			else {//출금계좌 있음	
				if( p[i].getBalance()==0 ) {
					System.out.printf("\t출금불가!!\t잔액 : %d원\n",p[i].getBalance());
					return;
				}
				while(p[i].getBalance()<money)     //잔액<  출금액
				{
					System.out.printf("\t잔액부족.. 지급한도 : %d원  다시 출금액? ",p[i].getBalance());
					money=sc.nextLong();
				}
				//출금시도  잔액>=출금액, 잔액한도 내의 출금
				p[i].subtractMoney(money);
				System.out.printf("\t출금후 잔액 : %d원\n",p[i].getBalance());
				break;  
			}
		}//while 
		System.out.println("#출금 작업을 완료합니다.");
	}
	public static void main(String[] args) {		
		while(true) {
			menu();
			System.out.print("작업선택? ");
			int jobNo=sc.nextInt();
			switch(jobNo) {
				case 1:makeAccid();break;
				case 2:deposit();break;
				case 3:withdraw();break;
				case 4:one_Inq();break;
				case 5:all_Inq();break;
				default:System.out.println("작업을 종료합니다.");					           
			return;
			}//switch
		}//while 	
	}
}
