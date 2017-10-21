/**
 * @(#)NaiveFibonacci.java
 *
 *
 * @author 
 * @version 1.00 2017/9/26
 */


public class NaiveFibonacci {
	public static int naiveFibonacci(int n){
		if(n<=1){
			return n;
		}
		else{
			return naiveFibonacci(n-1)+naiveFibonacci(n-2);
		}
	}
	public static void main (String[] args) {
		System.out.println(naiveFibonacci(20));
    }
}