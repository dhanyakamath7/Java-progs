
package banking;

public class Account {
	private int accno;
	private String name;
	private double bal;

	public  Account( int accno,String name,double bal) {
	this.accno=accno;
	this.name= name;
	this.bal=bal;
}
public void deposit(double amt) {
	if (amt>0) {
		bal+=amt;
		System.out.println("deposit succesful.new balance"+bal);
		}else
			System.out.println("deposit must be positive");
		
	}

public void withdraw(double amt)throws  InsufficientBalanceException{
	if(amt<0) {
		throw new ArithmeticException("withdraw amt cannot be negative");
		
	}
	if(amt>bal) {
		throw new  InsufficientBalanceException("insufficient balance to withdraw"+amt);
	}
		bal-=amt;
		System.out.println("Withdrawal successful.new balance" + bal);
}
public void showbal() {
	System.out.println("accno"+accno);
	System.out.println("name :"+name);
	System.out.println("current balance"+bal);
	
}
	
}
