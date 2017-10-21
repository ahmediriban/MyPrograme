/**
 * @(#)Fib_trail.java
 *
 *
 * @author 
 * @version 1.00 2017/9/19
 */
public class Fibonacci {
	static long fib(int s){
		if(s<=1)
			return s ;
		long tmp1=0;
		long tmp2=1;
		long tmp;
		int time=2;
		while(true){
			tmp=tmp1+tmp2;
			tmp1=tmp2;
			tmp2=tmp;
			time++;
			if((s)==time)
				break;
		}
		return tmp%10;
	}
	public static void main (String[] args) {
		System.out.println(fib(327305));
    }   
}