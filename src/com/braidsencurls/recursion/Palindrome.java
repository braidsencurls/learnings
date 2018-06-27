package com.braidsencurls.recursion;

public class Palindrome {
	
	public static void main(String[] args) {
		System.out.println(Palindrome.isPalindrome("rator"));
	}
	
	static boolean isPalindrome(String word) {
		int wordLength = word.length();
		System.out.println("Word: " + word + " length: " + wordLength);
		if(wordLength <= 1) {
			System.out.println("its palindrome");
			return true;
		} else {
			//take first and last letter
			char firstLetter = word.charAt(0);
			char secondLetter = word.charAt(word.length()-1);
			if(firstLetter == secondLetter) {
				//strip off first and last
				word = word.substring(1, word.length()-1);
				System.out.println("New word: " + word);
				if(isPalindrome(word)) return true;
			}
			return false;
		}
		
	}

}
