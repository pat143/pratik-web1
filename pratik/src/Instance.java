
public class Instance {
}
class Abc4 extends Instance
{
	Abc4()
	{
		super();
		System.out.println("Abc");
	}
	int a;
	{
	a=5;
	System.out.println("This is intance initializer block");
	System.out.println(""+a);
	}
	public static void main(String[] args) {
	//Instance c=new Instance();
	Abc4 aa=new Abc4();
	
	
	}

}
