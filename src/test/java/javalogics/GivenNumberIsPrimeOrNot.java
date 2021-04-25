package javalogics;

import java.util.Scanner;

public class GivenNumberIsPrimeOrNot 
{
	public static void main(String[] args) throws Exception
	{
		//Take data from Scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check wheather it is prime number or not");
		int x=sc.nextInt();
		sc.close();
		int flag=0;
		for(int i=2;i<x;i++)
		{
			if(x%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(x+"is a prime number");
		}
		else
		{
			System.out.println(x+"is not a prime nuber");
		}
	}
}
