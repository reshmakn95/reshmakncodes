package prime;

public class Problem {
		    public static void main (String[] args) 
		{
	    long i= 1;
	       long x= 2;
	        boolean flag=true;
	              while(flag) 
			{
	            int factors=divisors(i);
	            if (factors> 100          		) 
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

	    public static int divisors(long n) 
		{
	        int counter = 0;
	        for (int i=1;i<= n;i++) 
			{
	            if (n%i == 0) 
				counter++;
	        }
	        return counter;
	    }
	}