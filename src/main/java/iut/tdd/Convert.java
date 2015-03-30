package iut.tdd;

public class Convert {
	public static String num2text(String input) {
		if(input.equals("0")) return "zéro";
		if(input.equals("1")) return "un";
		if(input.equals("2")) return "deux";
		if(input.equals("3")) return "trois";
		if(input.equals("4")) return "quatre";
		if(input.equals("5")) return "cinq";
		if(input.equals("6")) return "six";	
		if(input.equals("7")) return "sept";
		if(input.equals("8")) return "huit";
		return "neuf";	

	}
	public static String text2num(String input) {
		return null;
	}

} 