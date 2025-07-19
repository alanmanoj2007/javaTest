package javatest;
import java.util.Scanner;
public class primenumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:\t");
	int num = sc.nextInt();
	boolean isPrime=true;
	for(int i=2;i<num/2;i++) {
		if(num%i==0) {
			isPrime=false;
			break;
		}
	
}
	if(isPrime) {
		System.out.println("The number is prime");
	}
	else {
		System.out.println("The number is not prime");
	}
}}
