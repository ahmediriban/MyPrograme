/**
 * @(#)Maximum_Pairwise_Product.java
 *
 *
 * @author 
 * @version 1.00 2017/9/18
 */
import java.util.Scanner ;
import java.lang.Math ;
public class Maximum_Pairwise_Product {
	static long pairwiseProudect(int set[])
	{
		long result = 0 ;
		int m = set.length;
		for(int i = 0 ; i < m ; i++)
		{
			for(int j = i + 1 ; j < m ; j++)
			{
				if((set[i]*set[j])>result)
					result = (long)set[i]*set[j];
			}
		}
		return result ;
	} 
	static long pairwiseProudectFast(int set[])
	{
		int max1 = 0 ;
		int max2 = 0 ;
		int m = set.length;
		int index = 0 ;
		for(int i = 0 ; i < m ; i++)
		{
			if(set[i]>max1)
				max1=set[i];
				index = i ;
		}
		for(int i = 0 ; i < m ; i++)
		{
			if(set[i]>max2)
				if(index != i )
					max2 = set[i];
		}
		long result = (long)max1 * max2 ;
		return result ;
	}	
		public static void main (String[] args) {
			/* while(true)
			{
				int s = (int)Math.random() % 10 + 2 ;
				int set[] = new int[s];
				for(int  i = 0 ; i < s ; i++)
		        {
				    set[i] = (int)Math.random() % 10 + 2;
		     	}
		     	System.out.print("Simple >> "+pairwiseProudect(set));
		     	System.out.print("\nFast >> "+pairwiseProudectFast(set));
		     	if(pairwiseProudect(set) != pairwiseProudectFast(set))
		     		System.out.print("Error!");
		     	else
		     		System.out.print("OK!");
			} */
			Scanner input = new Scanner(System.in);
		    System.out.print("How many item in the set ? ");
			int s = input.nextInt();
			int set[] = new int[s];
			for(int  i = 0 ; i < s ; i++)
			{
				set[i] = input.nextInt();
			}  
			System.out.print("Simple >> "+pairwiseProudect(set));
			System.out.print("\nFast >> "+pairwiseProudectFast(set)); 
	    }
}





