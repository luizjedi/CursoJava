package entities;

public class BusinessAccount extends Account {
	// Significa que a classe BusinessAccount
	// herdar? todas as caracter?sticas da classe
	// Account.

	private Double loanLimit;

	public BusinessAccount() {

	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // serve para executar a l?gica do construtor da classe base.
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		//Permite utilizar o m?todo existente na superclasse.
		super.withdraw(amount);
		balance -= 2.0;
	}

}
