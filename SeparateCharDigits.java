package com.homework26june;
import java.util.*;

public class SeparateCharDigits {
	public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);

		String password;
		String letters = "";
		String numbers = "";
		String symbols = "";
		
		System.out.println("Enter your Password :");
		password = sc.nextLine();
		
		for (int i=0;i<password.length();i++) {
			char ch = password.charAt(i);
			if(Character.isLetter(ch)) {
				letters += ch;
			}else if(Character.isDigit(ch)){
				numbers += ch;
			}else {
				symbols += ch;
			}
		}
		System.out.println("Letters: "+letters);
		System.out.println("Numbers: "+numbers);
		System.out.println("Symbols: "+symbols);
		
	}
}