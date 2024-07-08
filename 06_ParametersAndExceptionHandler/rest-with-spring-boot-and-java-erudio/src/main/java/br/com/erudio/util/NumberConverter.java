package br.com.erudio.util;

public class NumberConverter {

	public static Double convertToDouble(String strNumber) {
		if(strNumber  == null) return 0D;
		//accept numbers with . or , (BRL10,25 or USD 10.25)
		String number = strNumber.replaceAll(",", ".");
		if(isNumeric(number)) return Double.parseDouble(number);
		return 0D;
	}

	public static boolean isNumeric(String strNumber) {
		if(strNumber  == null) return false;
		String number = strNumber.replaceAll(",", ".");
		 return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
}
