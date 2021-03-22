package entities;

public class OutsourcedEmployee extends Employee {

	private Double additionalCharge;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double addtionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = addtionalCharge;
	}

	public Double getAddtionalCharge() {
		return additionalCharge;
	}

	public void setAddtionalCharge(Double addtionalCharge) {
		this.additionalCharge = addtionalCharge;
	}

	@Override
	public final Double payment() {
		return (hours * valuePerHour) + (additionalCharge * 1.1);
	}

}
