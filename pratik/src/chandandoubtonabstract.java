abstract class golu
{
	abstract  void abc();
	static int a;
	static void pqr(){
	int a=4;
		System.out.println(a);
	}
	
}
public class chandandoubtonabstract extends golu
{
	void abc()
	{
		super.pqr();
		System.out.println("abc");
	}
	

	public static void main(String[] args)
	{
		chandandoubtonabstract c=new chandandoubtonabstract();
		c.abc();

	}

}
