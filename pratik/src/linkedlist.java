import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
import java.util.Iterator;

public class linkedlist
{
	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("Java");
		hs.add("C-lang");
		hs.add("C++");
		hs.add("Java");
	   System.out.println(hs);
	   Iterator i=hs.iterator();
	   System.out.println("Forward Direction");

		while(i.hasNext())
		{
		System.out.println(i.next());
		}
	}

}
