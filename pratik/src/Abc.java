
public class Abc {
void meth()
{
	System.err.println("parent class method ");
}
}	
class Abc1 extends Abc
{
	void meth()
	{ 
		System.err.println("parent and child class method ");
	}
}
class Abc2 extends Abc1
{
	void meth()
	{
		System.err.println("child class method ");
	}
}
class Abc3 
{
	
	public static void main(String[] args) {
	 Abc a,a1,a2;
	 a=new Abc1();
	 a.meth();
	 a1=new Abc2();
	 a1.meth();
	 
	 
//	aa.meth();

	}

}
