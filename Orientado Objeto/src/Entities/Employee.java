package Entities;

public class Employee {

	public String Name;
	public double GrossSalary;
	public double Tax;

	public double NetSalary() {
		return GrossSalary - Tax;
	}

	public void IncreaseSalary(double percentage) {
		
		double update = (GrossSalary * percentage) / 100.0;
		update += NetSalary(); 
		
		System.out.printf("\nUpdate data: %s, %.2f", Name, update);
	}
}
