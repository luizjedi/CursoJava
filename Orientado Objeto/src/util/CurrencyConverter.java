package util;

public class CurrencyConverter {
	
	
	public static double PaidValue(double dollar, double qtd) {
		
		return ((dollar * qtd * 0.06) + dollar * qtd);
	}

}
