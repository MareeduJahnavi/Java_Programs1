/*
	Write a program to print the first N multiples of either 3, 5 or 7.

	Input Format:	First line consists of a positive integer n

	Output Format:	Print the first N multiples of either 3, 5 or 7, space separated.


	Sample Input 1
	10
	Sample Output 1
	3 5 6 7 9 10 12 14 15 18 


	Sample Input 2
	5
	Sample Output 2
	3 5 6 7 9 
*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    // Write your code here
    int count=0;
    for(int i=1;count<n;i++){
      if(i%3==0 || i%5==0 || i%7==0){
        System.out.print(i+" ");
        count++;
      }
    }
  }
}