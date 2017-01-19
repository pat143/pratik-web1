import java.util.*;
public class Eg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Java");
		lhs.add("C-lang");
		lhs.add("C++");
		lhs.add("Java");
	   System.out.println(lhs);
	   Iterator i=lhs.iterator();
	   System.out.println("Forward Direction");

		while(i.hasNext())
		{
		System.out.println(i.next());
		}
	}

}
