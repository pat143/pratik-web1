
public class String_meths 
{
	public static void main(String[] args) 
	{
		String s="";
		String s1="pratik";
		
		String s3=new String("pratik");
		String s4="kadam";
		String s5="Now you see me 2";
		String s6="PRATIK";
		char c;
		char c1[]=new char[10];
		
		c=s1.charAt(3);
		//System.out.println(c);  //charAt
		
		//System.out.println(s1.compareTo(s4)); //compareTo
		System.out.println(s1==s3);
		s=s1.concat(s3);
		//System.out.println(s); //concat
		
		//System.out.println(s5.contains("see me")); //contains
		
		//System.out.println(s5.endsWith("me 2")); //ends with
		
		//System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s6)); //equals()
		System.out.println(s1.equalsIgnoreCase(s3)); // equals ignore case()
		
		//System.out.println(String.format("value is %f", 32.3)); //format
		
		s5.getChars(4, 11, c1, 0);
		//qSystem.out.println(c1); //getchars
		
		//String s7= String.join("-","welcome","java");
	}

}
