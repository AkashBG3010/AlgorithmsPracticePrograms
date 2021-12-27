package com.bridgelabz.algorithmsprograms;

import java.util.Scanner;

public class AnagramDetection {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter string1:");
			String string1 = sc.next();
			System.out.println("Enter string2:");
			String string2 = sc.next();
			
			AnagramDetection anag1 = new AnagramDetection();
			anag1.anagram(string1,string2);	
		}
		public void anagram(String one, String two) {
			char newOne[] = one.toCharArray();
			char newTwo[] = two.toCharArray();			
			sortMethod(newOne);
			sortMethod(newTwo);
			one = new String(newOne);
			two = new String(newTwo);
			
			if(one.equals(two))
				System.out.println("It is not an Anagram");
			else
				System.out.println("It is an Anagram");
		}
		public static void sortMethod(char [] array) {
			char temp;
			
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length - i - 1; j++) {
					if (array[j] > (array[j + 1])) {
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
		
		}
}