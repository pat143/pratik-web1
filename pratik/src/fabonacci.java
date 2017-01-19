
public class fabonacci {
	//static int n1=0,n2=1,n3=0;

	private int fib(int n) {
	    if(n <= 1) {
	        return n;
	    } else {
	        return fib(n - 1) + fib(n - 2);
	    }
	    /* if(n>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         fib(n-1);    
	     } */   
	}
	
	
	public static void main(String[] args) {   
		fabonacci f = new fabonacci();
		  //System.out.print(n1+" "+n2);  
		  //fib(8);
		  
		  for(int i=0;i<7;i++)
		  {
			  System.out.println(f.fib(i));
		  }
		
	}

}
