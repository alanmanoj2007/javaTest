package javatest;
import java.util.Scanner;
public class sumOfDigits {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		int num1 = num;
		int sum=0;
		while(num!=0) {
			int temp=num%10;
			sum=sum+temp;
			num=num/10;
		}
		System.out.println("Sum of digits of number "+num1+"  is  "+sum);
	}

}
  