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
		}
	
}
