package com.example;

public class RomanToIntegerSolution {

	public static void main(String[] args) {
		String s = "IX";
		int answer = RomanToIntegerSolution.romanToInteger(s);
		System.out.println(answer);

	}

	public static int getValue(char c)
	{
		switch (c) 
		{
		case'I' : return 1;
		case'V' : return 5;
		case'X' : return 10;
		case'L' : return 50;
		case'C' : return 100;
		case'D' : return 500;
		case'M' : return 1000;
		default : return 0;		
	    }		
	}
	
	public static int romanToInteger(String str) {
		int n = str.length();
		int sum = 0;
		for(int i=0; i<n; i++)
		{
			char ch = str.charAt(i);
			if((i+1)<n && getValue(ch)<getValue(str.charAt(i+1)))
			{
				sum = sum-getValue(ch);
			}
			else
			{
				sum = sum+getValue(ch);
			}
		}
		return sum;

	}
}
