package Entities;

public class Account {

	private String holder;
	private int number;
	private double value;

	public Account(String holder, int number, double inicialDeposit) {

		this.holder = holder;
		this.number = number;
		Deposit(inicialDeposit); //M�todo encapsulado.
	}

	public Account(String holder, int number) {

		this.holder = holder;
		this.number = number;
	}

	public Account() {

	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getValue() {
		return value;
	}

	public void Deposit(double value) {
		this.value += value;
	}

	public void Whitdraw(double value) {
		this.value -= value + 5.0;
	}

	public String toString() {

		return 
				"Account " 
				+ number
				+ ", Holder: " 
				+ holder 
				+ ", Balance: $" 
				+ String.format("%.2f", value);

	}
}
