/*
	Write a program to find common factors of given 2 integers.

	Input Format:	First line contains space separated three integer input n, m.

	Output Format:	Print space separated common factors of 2 numbers.

	Sample Input 1
	10 20
	Sample Output 1
	1 2 5 10


	Sample Input 2
	15 30
	Sample Output 2
	1 3 5 15
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // implement your logic here
        for(int i=1;i<=n;i++){
            if(n%i==0 && m%i==0){
                System.out.print(i+" ");
            }
        }
    }
}