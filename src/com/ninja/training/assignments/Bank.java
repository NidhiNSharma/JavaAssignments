package com.ninja.training.assignments;

class Account {
    private int acctNumber;
    private String name;
    private Double balance;
    
    public Account(int acctNumber,String name, Double balance) {
    	this.acctNumber = acctNumber;
    	this.name = name;
    	this.balance = balance;
    }
    
    public Double getBalance() {
    	return balance;
    }
    
    public void depositMoney(Double money) {
    	balance = balance + money;
    }
    
    public void withdrawMoney(Double money) {
    	balance = balance - money;
    }

	public int getAcctNumber() {
		return acctNumber;
	}

	public String getName() {
		return name;
	}
    
}

public class Bank {

	public static void main(String[] args) {
		
		Account account = new Account(123, "Nidhi", 100.0);
		
		System.out.println("Name: " + account.getName());
		System.out.println("acctNumber: " + account.getAcctNumber());
		
		System.out.println("Balance: " + account.getBalance());
		Double amount = 100.0;
		System.out.println("Depositing: " + amount);
		account.depositMoney(amount);
		System.out.println("Balance: " + account.getBalance());
		
		amount = 50.0;
		System.out.println("Withdrawing: " + amount);
		if(amount <= account.getBalance()) {
			account.withdrawMoney(amount);
			System.out.println("Balance: " + account.getBalance());
		}
		else {
			System.out.println("Balance is too low for this amount. Please select a different amount.");
		}
		
		amount = 200.0;
		System.out.println("Withdrawing: " + amount);
		if(amount <= account.getBalance()) {
			account.withdrawMoney(amount);
			System.out.println("Balance: " + account.getBalance());
		}
		else {
			System.out.println("Balance is too low for this amount. Please select a different amount.");
			System.out.println("Balance: " + account.getBalance());
		}

	}

}
