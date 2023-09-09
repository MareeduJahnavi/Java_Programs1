/*
	Determine whether the given number is multiple of 5 or not

	Input Format:	First line contains single integer n

	Output Format:	Print Yes if it is multiple of 5, else No

	
	Sample Input 1
	24
	Sample Output 1
	No


	Sample Input 2
	30
	Sample Output 2
	Yes
*/
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    // Write your code here
    if(num%5==0){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}