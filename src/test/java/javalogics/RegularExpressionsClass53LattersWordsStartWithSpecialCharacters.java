package javalogics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsClass53LattersWordsStartWithSpecialCharacters
{
	public static void main(String[] args) throws Exception
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter as words");
		String x=sc.nextLine();
		sc.close();
		*/
		
		String x="hi mam how are u what about your next day plans Actully Iam waiting for next level interview schedule";
		//Words with length 3
		System.out.println("Words with length 3 are: ");
		Pattern p1=Pattern.compile("[a-zA-Z]+");
		Matcher m1=p1.matcher(x);
		while(m1.find())
		{
			if(m1.group().length()==3)
			{
				System.out.println(m1.group());
			}
		}
		
		System.out.println();
		Pattern p2=Pattern.compile("[a-zA-Z0-9]+");
		Matcher m2=p2.matcher(x);
		while(m2.find())
		{
			if(m2.group().startsWith("a"))
			{
				System.out.println(m2.group());
			}
		}
		
	}
}
