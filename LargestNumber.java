/**
 * @(#)LargestNumber.java
 *
 *
 * @author 
 * @version 1.00 2017/10/5
 */

import java.util.Scanner;
public class LargestNumber {
	static int largestNumber(int[] a){
		int s = a.length;
		int b[] = new int[s];
		for(int i=0;i<s;i++){
			if(a[i]>=10)
				return -1;
		}
		int m=0;
		while(m<s){
		int max=a[0];
		int max_index=0;
		for(int i=1;i<s;i++){
			if(a[i]!=0){
				if(a[i]>max){
				max=a[i];
				max_index=i;
		    	}
			}
		}
		b[m]=max;
		a[max_index]=0;
		m++;
		}
		for(int i=0;i<s;i++){
			System.out.printf("%d",b[i]);
		} 
		return 0;
	}
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("- How many digites do you want to enter : ");
		int m=input.nextInt();
		int b[]= new int[m];
		for(int i=0;i<m;i++){
			b[i]=input.nextInt();
		}
		largestNumber(b);
    }
}