/*
	Write a program to count factors of a given number.

	Input Format:	First line consists of a positive integer n

	Output Format:	Print the integer count.

	
	Sample Input 1
	20
	Sample Output 1
	6
	Sample Input 2
	15
	Sample Output 2
	4
*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    // Write your code here
    int count=0;
    for(int i=1;i<=n;i++){
      if(n%i==0){
        count+=1;
      }
    }
    System.out.println(count);
  }
}