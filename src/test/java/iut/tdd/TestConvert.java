package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero () {
		// Given
		String input = "0";
		String expected = "zéro";
		String input1 = "1";
		String expected1 = "un";
		String input2 = "2";
		String expected2 = "deux";
		String input3 = "3";
		String expected3 = "trois";
		String input4 = "4";
		String expected4 = "quatre";
		String input5 = "5";
		String expected5 = "cinq";
		String input6 = "6";
		String expected6 = "six";
		String input7 = "7";
		String expected7 = "sept";
		String input8 = "8";
		String expected8 = "huit";
		String input9= "9";
		String expected9 = "neuf";
		String input10= "10";
		String expected10 = "dix";
		String input11= "11";
		String expected11 = "onze";
		String input12= "12";
		String expected12 = "douze";
		String input13= "13";
		String expected13 = "treize";
		String input14= "14";
		String expected14 = "quatorze";
		String input15= "15";
		String expected15 = "quinze";
		String input16= "16";
		String expected16 = "seize";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
		
		actual = myConvert.num2text(input1);
		Assert.assertEquals(expected1, actual);
		actual = myConvert.num2text(input2);
		Assert.assertEquals(expected2, actual);
		actual = myConvert.num2text(input3);
		Assert.assertEquals(expected3, actual);
		actual = myConvert.num2text(input4);
		Assert.assertEquals(expected4, actual);
		actual = myConvert.num2text(input5);
		Assert.assertEquals(expected5, actual);
		actual = myConvert.num2text(input6);
		Assert.assertEquals(expected6, actual);
		actual = myConvert.num2text(input7);
		Assert.assertEquals(expected7, actual);
		actual = myConvert.num2text(input8);
		Assert.assertEquals(expected8, actual);
		actual = myConvert.num2text(input9);
		Assert.assertEquals(expected9, actual);
		actual = myConvert.num2text(input10);
		Assert.assertEquals(expected10, actual);
		actual = myConvert.num2text(input11);
		Assert.assertEquals(expected11, actual);
		actual = myConvert.num2text(input12);
		Assert.assertEquals(expected12, actual);
		actual = myConvert.num2text(input13);
		Assert.assertEquals(expected13, actual);
		actual = myConvert.num2text(input14);
		Assert.assertEquals(expected14, actual);
		actual = myConvert.num2text(input15);
		Assert.assertEquals(expected15, actual);
		actual = myConvert.num2text(input16);
		Assert.assertEquals(expected16, actual);
		}
	
}
