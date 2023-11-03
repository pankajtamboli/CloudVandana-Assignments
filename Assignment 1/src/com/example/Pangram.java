package com.example;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your sentence");
		String s = sc.next();
		
		//calling the method
		boolean answer = Pangram.checkPangram(s.toLowerCase());

		if(answer)
			System.out.println("Sentence is Pangram");
		else
			System.out.println("Sentence is not pangram");

		sc.close();
	}

	private static boolean checkPangram(String str) {
		if(str.length()<26)
			return false;
		else
		{
			for(char ch ='a'; ch<'z'; ch++)
			{
				if(str.indexOf(ch) < 0)
					return false;
			}
		}
		return true;
	}

}
