package entities;

public class Individual extends Person {

	private Double healthExpenses;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenses) {
		super(name, anualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public final double tax() {

		double totalTax = 0.0;

		if (getAnualIncome() < 20000.0) {

			totalTax = (getAnualIncome() * 0.15) - (healthExpenses * 0.50);
		}

		else {

			totalTax = (getAnualIncome() * 0.25) - (healthExpenses * 0.50);
		}

		return totalTax;

	}

}
