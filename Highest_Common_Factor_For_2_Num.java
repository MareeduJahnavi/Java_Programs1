/*
	Write a program to find the greatest common factor of given 2 integers.

	Input Format:	First line contains space separated three integer input n, m.

	Output Format:	Print greatest common factor of 2 numbers.

	Sample Input 1
	10 20
	Sample Output 1
	10


	Sample Input 2
	15 30
	Sample Output 2
	15
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // implement your logic here
		int i;
		int max=0;
		for(i=1;i<=n;i++) {
			if(n%i==0 && m%i==0) {
				max=i;
			}
		}
		System.out.print(max);
    }
}