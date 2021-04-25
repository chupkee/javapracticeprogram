package javalogics;

public class NameString
{
	public static void main(String[] args) throws Exception
	{
		String x="Rajashekar vaggu";
		for(int i=0;i<x.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(x.charAt(j));
			}
			System.out.println();
		}
		
	}

}
