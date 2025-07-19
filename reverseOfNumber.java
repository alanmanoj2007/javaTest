package javatest;
import java.util.Scanner;
public class reverseOfNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:\t");
	int num = sc.nextInt();
	int reverse=0;
	while(num!=0) {
		int digit=num%10;
		reverse=reverse*10+digit;
		num=num/10;
	}
	System.out.println("The reverse  is " + reverse);
}
}
