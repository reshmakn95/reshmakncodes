package prime;

public class Problem {
		    public static void main (String[] args) 
		{
	    long i= 1;
	       long x= 2;
	        boolean flag=true;
	        long factors=0;
	              while(flag) 
			{
	            
	            factors=divisors(i);
	            if (factors>500) 
				{
	                System.out.println(i);
	                flag=false;
	                	            }
	            else 
				{
	                i+=x;
	                x++;
	            }
	        }
	    }

	    public static long divisors(long n) 
		{
	         	long counter = 0;
	        for (int i=1;i<Math.sqrt(n);i++) 
			{
	            if (n%i == 0)
	            {
	            	if(n%i==i)
	            	counter++;
	            	else
	            		counter+=2;
	        }
			}
	        return counter;
	    
	}
}