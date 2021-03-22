package application;

import entities.Account;
import entities.SavingsAccount;

public class Polimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1020, "Alex", 1000.0, 0.01);
		
		// A mesma chamada de fun��o foi utilizada em duas subclasses, por�m
		// os m�todos s�o diferentes.
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
