interface i1
{
	interface i2
	{
		void abc();
	}
}


public class  demo implements i1.i2
{
	public void abc()
	{
		System.out.println("inner");
	}
	public static void main(String[] args) 
	{
		//i1.i2 i= new demo();
		demo d=new demo();
		d.abc();
	}  
	
}
