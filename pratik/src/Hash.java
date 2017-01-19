import java.util.*;
public class Hash {

	public static void main(String[] args) {
		Hashtable c=new Hashtable(25);
         c.put(new S(1), "A");
         c.put(new S(12), "A");
         c.put(new S(11), "A");
         c.put(new S(15), "A");
         c.put(new S(6), "A");
         c.put(new S(7), "A");
         c.put(new S(9), "A");
         c.put(new S(10), "A");
         System.out.println(c);
	}

}
class S{
	int i;
	S(int i)
	{
		this.i=i;
	}
	public int hashCode(){
		return i;
	}
	public String toString()
	{
	return i+"";
	}
	
}
