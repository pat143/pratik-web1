class Factorial
{int result=1;
	int fact(int n)
	{
		
		if(n==0)
		{
			
			//return 1;
		}
		else
		{
			result = n*fact(n-1); 
			//System.out.println("abc");
			
		//result=result*fact(n);
			
		}
		return result;
		
				
	}
	public static void main(String[] args) 
	{
	Factorial f=new Factorial();
	
	int a = f.fact(5);
	
	System.out.println(a);
	
	}
	
	
}