package javalogics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsClass1 
{
	public static void main(String[] args) 
	{
		String x="hkjxhzck jckjv seuuise89en uyfwe8f we 8 09wedn isd8u8ed we are welcom3 th3 w9e fcwefw9 o4j5i";
		Pattern p=Pattern.compile("[0-9]+");
		Matcher m=p.matcher(x);
		while(m.find())
		{
			String y=m.group();
			System.out.println(y);
		}	
	}
}
