/*
	Write a program to print first N multiples of 3.

	Input Format:	First line consists of a positive integer n

	Output Format:	Print the required space separated number series


	Sample Input 1
	7
	Sample Output 1
	3 6 9 12 15 18 21
 
	Sample Input 2
	3
	Sample Output 2
	3 6 9 
*/



import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    // Write your code here
    for(int i=1;i<=n;i++){
      System.out.print(3*i+" ");
    }
  }
}