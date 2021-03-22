package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class SobreposicaoOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		// Sobreposição
		Account acc2 = new SavingsAccount(1002, "Luiz", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		// Sobreposição utilizando o super();
		Account acc3 = new BusinessAccount(1003, "Luiz", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}

}
