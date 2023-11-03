package com.example;

public class ArrayShuffle {

	public static void main(String[] args) {

		int[] array = {1, 2, 3, 4, 5, 6, 7};
		ArrayShuffle.shuffleArray(array);
	}


	private static void shuffleArray(int[] array) {
		
		int noOfElement = array.length;

		for(int i=0; i<noOfElement; i++)
		{
			int s = (int) (i + Math.random() * (noOfElement -i));
			int temp = array[s];
			array[s] = array[i];
			array[i] = temp;
		}
		
       //To print array
		for(int i=0 ; i<noOfElement; i++)
		{
			System.out.println(array[i]+ " ");
		}

	}

}
