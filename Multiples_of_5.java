/*
	Write a program to print first N multiples of 5.

	Input Format:	First line consists of a positive integer n

	Output Format:	Print the required space separated number series

	Sample Input 1
	5
	Sample Output 1
	5 10 15 20 25 


	Sample Input 2
	3
	Sample Output 2
	5 10 15

*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    // Write your code here
    for(int i=1;i<=n;i++){
      System.out.print(5*i+" ");
    }
  }
} 