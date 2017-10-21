/**
 * @(#)GCD.java
 *
 *
 * @author 
 * @version 1.00 2017/9/22
 */
import java.util.Scanner;

public class GCD {
	static int gcd(int x,int y){
		int result=x%y;
		if(result==0)
			return y;
		else
			return gcd(y,result);
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		System.out.printf("%d",gcd(x,y));
    }
}