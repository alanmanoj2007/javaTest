package javatest;
import java.util.Scanner;
public class GCD {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int temp=0;
	System.out.println("Enter the first number:\t");
	int a=sc.nextInt();
	System.out.println("Enter the second number:\t");
	int b=sc.nextInt();
	for(int i=1;i<=a && i<=b;i++) {
		if(a%i==0 && b%i==0) {
			temp=i;
		}
	}
	System.out.println("The GCD of " + a +" and " + b + " is " +temp);
}
}
