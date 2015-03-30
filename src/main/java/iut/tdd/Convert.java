package iut.tdd;

import java.util.HashMap;

public class Convert {
	public static String num2text(String input) {
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("0", "zéro");
		map.put("1", "un");
		map.put("2", "deux");
		map.put("3", "trois");
		map.put("4", "quatre");
		map.put("5", "cinq");
		map.put("6", "six");
		map.put("7", "sept");
		map.put("8", "huit");
		map.put("9", "neuf");
		map.put("10", "dix");
		map.put("11", "onze");
		map.put("12", "douze");
		map.put("13", "treize");
		map.put("14", "quatorze");
		map.put("15", "quinze");
		map.put("16", "seize");
		return map.get(input);

	}
	public static String text2num(String input) {
		return null;
	}

} 