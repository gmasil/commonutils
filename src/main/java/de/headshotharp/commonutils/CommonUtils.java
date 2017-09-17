package de.headshotharp.commonutils;

import java.awt.Color;

public class CommonUtils
{
	public static String decimalDots(int val)
	{
		return String.format("%,d", val).replace(',', '.');
	}

	public static String colorToHtml(Color color)
	{
		return "rgb(" + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue() + ")";
	}

	public static String nl2br(String text)
	{
		return text.replace("\n", "<br />");
	}

	public static String br2nl(String text)
	{
		return text.replace("<br>", "\n").replace("<br />", "\n");
	}

	public static String IntToRoman(int value)
	{
		String roman = "";
		if (value == 0) return "0";
		if (value < 0) return "" + value;
		if (value <= 3999)
		{
			while (value / 1000 >= 1)
			{
				roman += "M";
				value = value - 1000;
			}
			if (value / 900 >= 1)
			{
				roman += "CM";
				value = value - 900;
			}
			if (value / 500 >= 1)
			{
				roman += "D";
				value = value - 500;
			}
			if (value / 400 >= 1)
			{
				roman += "CD";
				value = value - 400;
			}
			while (value / 100 >= 1)
			{
				roman += "C";
				value = value - 100;
			}
			if (value / 90 >= 1)
			{
				roman += "XC";
				value = value - 90;
			}
			if (value / 50 >= 1)
			{
				roman += "L";
				value = value - 50;
			}
			if (value / 40 >= 1)
			{
				roman += "XL";
				value = value - 40;
			}
			while (value / 10 >= 1)
			{
				roman += "X";
				value = value - 10;
			}
			if (value / 9 >= 1)
			{
				roman += "IX";
				value = value - 9;
			}
			if (value / 5 >= 1)
			{
				roman += "V";
				value = value - 5;
			}
			if (value / 4 >= 1)
			{
				roman += "IV";
				value = value - 4;
			}
			while (value >= 1)
			{
				roman += "I";
				value = value - 1;
			}
			return roman;
		}
		else
		{
			return "" + value;
		}
	}
}
