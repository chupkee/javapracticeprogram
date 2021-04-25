package javalogics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsClass2 
{
	public static void main(String[] args) 
	{
		//Take date from Scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Write an application latter for bank");
		String x=sc.nextLine();
		sc.close();
		
		//String x="jhasd msd23h jdfd xc9eur @#*E 8 dp(#*W EWE XqN794 iufw0*EUWQ IUEW@*#*&$ 01 1 fhsdf sd09 dwe aew w jhuwrw#&Y#*(";
		Pattern p1=Pattern.compile("[a-z]+");
		Pattern p2=Pattern.compile("[A-Z]+");
		Pattern p3=Pattern.compile("[a-zA-Z]+");
		Pattern p4=Pattern.compile("[a-zA-Z0-9]+");
		Pattern p5=Pattern.compile("[A-Za-z0-9]+");
		Pattern p6=Pattern.compile("[0-9]+");
		Pattern p7=Pattern.compile("[^A-Za-z0-9]{8}+");
		Matcher m1=p1.matcher(x);
		Matcher m2=p2.matcher(x);
		Matcher m3=p3.matcher(x);
		Matcher m4=p4.matcher(x);
		Matcher m5=p5.matcher(x);
		Matcher m6=p6.matcher(x);
		Matcher m7=p7.matcher(x);
		int c1=0;
		int c2=0;
		int c3=0;
		int c4=0;
		int c5=0;
		int c6=0;
		int c7=0;
		while(m1.find())
		{
			c1=c1+1;
			System.out.println(m1.group());
		}
		System.out.println("No of matchers with pattern1 is "+c1);
		
		while(m2.find())
		{
			c2=c2+1;
			System.out.println(m2.group());
		}
		System.out.println("No of matcher with pattern2 is "+c2);
		
		while(m3.find())
		{
			c3=c3+1;
			System.out.println(m3.group());
		}
		System.out.println("No of matcher with pattern3 is "+c3);
		
		while(m4.find())
		{
			c4=c4+1;
			System.out.println(m4.group());
		}
		System.out.println("No of matcher with pattern4 is "+c4);
		
		while(m5.find())
		{
			c5=c5+1;
			System.out.println(m5.group());
		}
		System.out.println("NO of matcher with pattern5 is "+c5);
		
		while(m6.find())
		{
			c6=c6+1;
			System.out.println(m6.group());
		}
		System.out.println("No of matcher with pattern6 is "+c6);
		
		while(m7.find())
		{
			c7=c7+1;
			System.out.println(m7.group());
		}
		System.out.println("No of matcher with pattern7 is "+c7);
		
	}
}
