package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] str = {"and", "or", "at", "I", "a"};
		//2. print the third element in the array
		System.out.println(str[3]);
		//3. set the third element to a different value
		str[3] = "dabdabadoo";
		//4. print the third element again
		System.out.println(str[3]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < str.length; i++) {
			str[i] = "hello";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		//7. make an array of 50 integers
		int[] arr = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < arr.length; i++) {
			Random ran = new Random();
			int rand = ran.nextInt(100);
			arr[i] = rand;
		}
		//9. without printing the entire array, print only the smallest number on the array
		int small = 101;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]  < small) {
				small = arr[i];
			}
			
		}
		System.out.println("smallest is  " + small);
		//10 print the entire array to see if step 8 was correct
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//11. print the largest number in the array.
		int large = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] >= large) {
				large = arr[i];
			}
		}
		System.out.println("largest is "+large);
		//12. print only the last element in the array
		System.out.println(arr[arr.length - 1]);
	}
}
