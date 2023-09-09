/*
	Write a program to find factors of a given number.

	Input Format:	First line consists of a positive integer n

	Output Format:	Print the space separated integer factors of given number.


	Sample Input 1
	20
	Sample Output 1
	1 2 4 5 10 20 


	Sample Input 2
	15
	Sample Output 2
	1 3 5 15 
*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    // Write your code here
    for(int i=1;i<=n;i++){
      if(n%i==0){
        System.out.print(i+" ");
      }
    }
  }
}