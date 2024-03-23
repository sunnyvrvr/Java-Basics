package p2;

public class Ex19_Condition_rcp {

	public static void main(String[] args) {
		
			java.util.Scanner sc; 
			sc = new java.util.Scanner(System.in);

//		for (int i = 0; i < 10; i++) {
//			double r = ((int)(Math.random()*3+1)); //1<= <4
//			int r = ((int) (Math.random() * 3 + 1)); // double을 int로 바꿔야함
//			r =((int)r);
//			System.out.println(r);
		
			System.out.println("가위바위보");		
			System.out.println("가위-1, 바위-2, 보-3를 입력하세요");	
			int u = Integer.parseInt(sc.nextLine());
			int r = (int)(Math.random() * 3) + 1;

			System.out.println(r);  //print, println이 좋음	
			if(u == r) {
				System.out.println("비겼습니다");		
			} else if ( (u+2) == r){ //풀어서 작성하기 
				System.out.println("승리했습니다");	
			} else if ( u > r ) {
				System.out.println("승리했습니다");				
			} else if ( u < r ) {
				System.out.println("패배했습니다");				
			} else {
				System.out.println("패배했습니다");	
			}
//			//답안
			System.out.println("사용자:" +u+ "컴퓨터:"+r);	
			if(u == r) {
				System.out.println("비겼습니다");		
			} else if ( u<1 || u>3 ){
				System.out.println("잘못입력하였습니다");	
			} else if( ( u==1 && r==3) || ( u==2 && r==1) || ( u==3 && r==2)){
				System.out.println("승리했습니다");				
			} else {
				System.out.println("패배했습니다");	
			}
			//답안2
			System.out.println("사용자:" +u+ "컴퓨터:"+r);	
			if(u == r) {
				System.out.println("비겼습니다");		
			} else if ( u==1 ){
				if ( r==3 ) {
					System.out.println("승리했습니다");	
				} else {
					System.out.println("패배했였습니다");	
				}
			}  else {
				System.out.println("패배했습니다");	
			} 
			//제일 짧은 코드 
			System.out.println("모범답안: 사용자:" +u+ "컴퓨터:"+r);	
			if(u == r) {
				System.out.println("비겼습니다");		
			} else if ( u<1 || u>3 ){
				System.out.println("잘못입력하였습니다");	
			} else if( u-r%3 == 1){
				System.out.println("승리했습니다");				
			} else {
				System.out.println("패배했습니다");	
			}
	}
			
	}

	 

