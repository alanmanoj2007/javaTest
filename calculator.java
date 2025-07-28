package javatest;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number:");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number:");
		int num2 = sc.nextInt();
		System.out.print("Enter the operation:");
		char operation = sc.next().charAt(0);
		int num3=0;
		float num4=0;
		switch(operation) {
		case '+':
			 num3=num1+num2;
			System.out.println(num1+"+"+num2+"="+num3);
			break;
		case '-':
			num3=num1-num2;
			System.out.print(num1+"-"+num2+"="+num3);
			break;
		case '*':
			num3=num1*num2;
			System.out.print(num1+"x"+num2+"="+num3);
			break;
		case '/':
			num4=(float)num1/num2;
			System.out.print(num1+"/"+num2+"="+num4);
			break;
		default :
			System.out.println("The operation is invalid");
			break;
		}
	
		
	}

}
