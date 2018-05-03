package prime;

public class Prime {

  public static void main(String[] args)
  {
  long sum=0;
  for(long i=2;i<2000000;i++)
    {
	  boolean b=ifPrime(i);
	  
	  if(b==true)
	sum+=i;
	}
	
	  System.out.println(sum + "is sum of prime no below 2 million");
  }
  private static   boolean ifPrime(long n)
  {
  for(int j=2;j<=(Math.sqrt(n));j++)
     {
	 if(n%j==0)
	 return false;
	 }
  return true;
  }
}

