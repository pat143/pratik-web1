class Table{
	int n;
	public Table(int n) 
	{
		this.n=n;
	}
  
 void printTable(int j){//method not synchronized  
	 synchronized (this) {
		
	
   for(int i=1;i<=5;i++)
   {  
     System.out.println(j*n);  
     try
     {  
      Thread.sleep(400);  
     }
     catch(Exception e){System.out.println(e);}  
   }  
  
 }  
}  }

public class syncro_without {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Table obj = new Table(3);//only one object  
		//MyThread1 t1=new MyThread1(obj);  
		//MyThread2 t2=new MyThread2(obj);  
		Thread t1 = new Thread()
		{
			public void run()
			{
			obj.printTable(5);
			}
		};
		Thread t2 =new Thread()
		{
			public void run()
			{
				obj.printTable(7);
			}
		};
		t1.start();  
		t2.start();  
	}

}
