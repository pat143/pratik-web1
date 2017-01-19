
public class Wrapper extends Thread {
	
	public void run()
	{
		try
		{
		for(int i=0;i<5;i++)
		{
			sleep(0);
			System.out.println(Thread.currentThread().getName());
			 System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
				
		}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Wrapper t1=new Wrapper();  
		Wrapper t2=new Wrapper();  
		
		t1.setPriority(7);  
		t2.setPriority(Thread.MAX_PRIORITY); 
		  
		  t1.start();  
		  t2.start(); 
	}

}
