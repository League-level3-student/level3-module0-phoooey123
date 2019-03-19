package _03_More_Array_Fun;

import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] str = { "a", "b", "c", "d" };
		takeString(str);
		takeStringRev(str);
		takeString2(str);
		takeStringRan(str);

	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	static void takeString(String[] str) {
		for (int i = 0; i < str.length; i++) {
			// System.out.println(str[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	static void takeStringRev(String[] str) {
		for (int i = str.length; i > 0; i--) {
			// System.out.println(str[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	static void takeString2(String[] str) {
		for (int i = 0; i < str.length; i += 2) {
			// System.out.println(str[i]);
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	static void takeStringRan(String[] str) {
		for (int i = 0; i < str.length*20; i++) {
			Random r = new Random();
			int ran = r.nextInt(4);
			int ran2 = r.nextInt(4);
			String temp = str[ran];
			str[ran] = str[ran2];
			str[ran2] = temp;
			
			
			
			
		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

	}
}
