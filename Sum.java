/**
 * @(#)sum.java
 *
 *
 * @author 
 * @version 1.00 2017/9/18
 */

import java.util.Scanner ;
public class Sum {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String m = input.nextLine();
		int m1 = m.charAt(0) - 48;
		int m2 = m.charAt(2) - 48;
		if((m1<=9&&m1>=1)&&(m2<=9&&m2>=1))
		{
			System.out.println(m1+m2);
		}
		else
			System.out.println("Error!");
    }
}