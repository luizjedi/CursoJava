package entities;

public abstract class Person {

	private String name;
	private Double anualIncome;

	public Person() {

	}

	public Person(String name, Double income) {

		this.name = name;
		this.anualIncome = income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}

	public abstract double tax();
}
