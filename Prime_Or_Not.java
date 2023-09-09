/*
	Write a program to find whether the given number is a prime number or not.

	Input Format:	First line consists of a positive integer n

	Output Format:	Print Yes if the number is prime, else print No

	Sample Input 1
	11
	Sample Output 1
	Yes


	Sample Input 2
	15
	Sample Output 2
	No
*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}
  	}
}