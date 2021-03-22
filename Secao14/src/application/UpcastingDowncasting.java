package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class UpcastingDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Account acc = new Account(1001, "Alex", 0.0);
		// BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// Upcasting

		// Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Hanna", 0.0, 700.0);
		Account acc3 = new SavingsAccount(1004, "Luiz", 800.0, 0.01);

		// Downcasting

		BusinessAccount bacc1 = (BusinessAccount) acc2;
		bacc1.loan(100.0);

		// BusinessAccount bacc2 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			// A palavra instanceof permite analisar se as operações realizadas
			// dentro dos laços serão bem sucedidas e evitar erros de compilação
			BusinessAccount bacc3 = (BusinessAccount) acc3;
			bacc3.loan(200.0);
			System.out.println("Loan!");
		}

		if (acc3 instanceof SavingsAccount) {
			SavingsAccount bacc3 = (SavingsAccount) acc3;
			bacc3.updateBalance();
			System.out.println("Update!");
		}
	}

}