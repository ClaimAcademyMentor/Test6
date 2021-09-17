package loops;

import java.util.Arrays;

public class Lab3Test {

	public static void main(String[] args) {
//		1. Write a method to remove a given character from a string. 
		// E.g. remove all 'a' from Averange should return vernge
		charRemover();
		String name = "Mississippi";
		char removed = 'm';
//		System.out.println("The word " + name + " is " + hervesMethod(name, removed) + 
//				" after removing " + removed);
		matthewsMethod(name);
		
	}
	
	public static void charRemover() {
		String name = "Averange";
		// name = name.toLowerCase();
		
		String word = name.replace("a", "");
		word = name.replaceAll("[Aa]", "");
		System.out.println(word);
	}
	
//	public static String hervesMethod(String name, char removed) {
//		String temp = "";
//		char[] value = name.toCharArray();
//		// "Mississippi"
//	// Index 0 |  1 |  2 |  3 |  4 |  5 |  6 |  7 |  8 |  9 | 10 
//		// {'M', 'i', 's', 's', 'i', 's', 's', 'i', 'p', 'p', 'i'}
//		for (int i = 0; i < value.length; i++) {
//			if(Character.toLowerCase(value[i]) != Character.toLowerCase(removed)) {
//				temp = temp + value[i];
//				System.out.println(temp);
//			}
//		}
//		
//		return temp;
//	}
	
	public static void matthewsMethod(String name) {
		char[] letters = name.toCharArray();
		
		int index = 0;
		int j;
		
		for (int i = 0; i < letters.length; i++) {
			System.out.println("OUTER LOOP IS AT " + i);
			for (j = 0; j < letters.length; j++) {
				System.out.println("INNER LOOP IS AT " + j);
				if(letters[i] == letters[j]) {
					break;
				}
			}
			if(j == i) {
				letters[index++] = letters[i];
				System.out.println(letters[index]);
			}
		}
		System.out.println(Arrays.copyOf(letters, index));
	}

}
