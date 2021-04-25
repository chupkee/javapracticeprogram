package javalogics;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsClass4ToFindFirstAndLastMatchedNumericNumbers 
{
	public static void main(String[] args) throws Exception
	{
		String x="jdnjf 01021 sndf8e3bb jhI#(& &@^#& jhsjhf86w39y 4 the indian 586arma";
		Pattern p=Pattern.compile("[0-9]+");
		Matcher m=p.matcher(x);
		ArrayList<String> a=new ArrayList<String>();
		while(m.find())
		{
			String y=m.group();
			a.add(y);
			//System.out.println(y);
		}
		int z=a.size();
		System.out.println(a.get(0));
		System.out.println(a.get(z-1));
		
	}
}
