package util;

public class CurrencyConverter {
	
	public static final double iof = 1.06;
	
	public static double converter(double dollarPrice, double dollarsBought) {

			return dollarPrice * dollarsBought * iof;
	}
}
