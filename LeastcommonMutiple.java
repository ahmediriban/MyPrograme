/**
 * @(#)LeastcommonMutiple.java
 *
 *
 * @author 
 * @version 1.00 2017/9/27
 */


public class LeastcommonMutiple {
	static long lcm(int a ,int b){
		long x[]= new long[10];
		long y[]= new long[10];
		if(a>b){
			int tmp;
			tmp=b;
			b=a;
			a=tmp;
		}
		x[0]=a;
		y[0]=b;
		int i=1;
		long m=0;
		boolean r=true;
		while(r==true){
				x[i]=a*(i+1);
				y[i]=b*(i+1);
				for(int j=0;j<=i;j++){
					if(x[i]==y[j]){
						m=x[i];
						r=false;
					    break;
					}
				}
				if(r==true&&x[i]>a*b){
					m=(long)a*b;
					break;
				}
				i++;
		}
		return m;
	} 
	public static void main (String[] args) {
		System.out.println(lcm(10,20));
	}
}