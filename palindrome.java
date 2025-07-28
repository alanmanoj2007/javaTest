package javatest;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number:\t");
			int num = sc.nextInt();
			int reverse=0;
			int oldNum=num;
			while(num!=0) {
				int digit=num%10;
				reverse=reverse*10+digit;
				num=num/10;
			}
			if(oldNum==reverse) {
				System.out.println("The number is palindrome");
				}
				else{
					System.out.println("The number is not palindrome");
					}
				}
			}
