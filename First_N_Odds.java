/*
	Write a program to print the first N odd natural numbers.

	Input Format:	First line consists of a positive integer n

	Output Format:	Print the number from 1 to n space separated odd integers.

	Sample Input 1
	5
	Sample Output 1
	1 3 5 7 9 

	Sample Input 2
	3
	Sample Output 2
	1 3 5
*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    // Write your code here
    for(int i=1;i<=n;i++){
      System.out.print(2*i-1+" ");
    }
  }
} 