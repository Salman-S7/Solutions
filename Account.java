package encapsulation;

import java.util.Scanner;

public class Account {
	private int accId,balance;
	private String accType;
	
	
	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public boolean withdraw(int amount){
		if(balance>amount) {
			System.out.println("balance after withdrawing "+amount+" is "+(balance-amount));
			return true;
		}else {
			System.out.println("your account don't have enough balance \nplease enter amount less than "+balance);
			return false;
		}
	}
	
}
class AccountDetails{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		
		Account obj =getAccountDetails();
		System.out.println("Enter amount to withdraw");
		int amount = sc.nextInt();
		amount=getWithdrawAmount(amount);
		
		
		obj.withdraw(amount);
				
		
	}
	public static Account getAccountDetails(){
		
		System.out.println("Enter account ID");
		int accId = sc.nextInt();
		
		System.out.println("Enter account Type");
		String accType = sc.next();
		
		System.out.println("Enter account balance");
		int balance = sc.nextInt();
		if(balance<0) {
			do {
				System.out.println("negative balannce is not allowed \n"+"enter positive value");
				balance = sc.nextInt();
				if(balance>0)
					break;
				
			}while(balance<0);
		}
		Account obj = new Account();
		obj.setAccId(accId);
		obj.setAccType(accType);
		obj.setBalance(balance);
		return obj;
		
	}
	public static int getWithdrawAmount(int amount) {
		
		if(amount<0) {
			do {
				System.out.println("negative amount is not allowed \n"+"enter positive value");
				amount = sc.nextInt();
				if(amount>0)
					break;
				
			}while(amount<0);
		}
		return amount;
		
	}
}
