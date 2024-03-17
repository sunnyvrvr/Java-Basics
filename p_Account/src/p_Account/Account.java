package p_Account;

public class Account {
      private String accId;//계좌번호
      private String cusName;//고객명
      private long balance;//잔액
      public void subtractMoney(long money){ balance-=money;  }
      public void addMoney(long money){ balance+=money;    }
      public  long getBalance(){ return balance; }
      public String getAccid(){ return accId;  }
      public Account(String accId, String cusName, long money){
    	  this.accId=accId;//멤버변수=매개변수;
    	  this.cusName=cusName;
    	  balance=money;
    	 // System.out.println("생성자...");
      }
      public void disp(){
    	  System.out.printf("계좌번호 : %s\t고객명 : %s\t잔액 : %12d원\n",accId,cusName,balance);
      }
}

