/*

	Multiples of Two & Three

	Write a program to print all the numbers which are multiples of either 2 or 3 till N.

	Input Format:	First line consists of a positive integer n

	Output Format:	Print the number from 2 to n space separated multiples of 2 and 3 integers.


	Sample Input 1
	15
	Sample Output 1
	2 3 4 6 8 9 10 12 14 15 

	Sample Input 2
	10
	Sample Output 2
	2 3 4 6 8 9 10 
*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    // Write your code here
    for(int i=1;i<=n;i++){
      if(i%2==0 || i%3==0){
        System.out.print(i+" ");
      }
    }
  }
}
