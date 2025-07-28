package javatest;
import java.util.Scanner;
public class checkVowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a letter:");
		char letter =sc.next().charAt(0);
		switch(Character.toLowerCase(letter)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		System.out.println("It is a vowel.");
		break;
		default:
			System.out.println("It is a consant");			
		}
		
		
	}
}
