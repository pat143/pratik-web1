import java.util.ArrayList;
import java.util.HashSet;


public class hashset {

	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("pk");
		al.add("pk");
		al.add("pk");
		HashSet<String> h=new HashSet<String>();
		//h.add("pratik");
		//h.add("pat");
		//h.add("pat");
		h.addAll(al);
		for(String s:h)
		{
			System.out.println(s);
		}

	}

}
