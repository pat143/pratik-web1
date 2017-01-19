import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.io.*;


public class regex 
{
		public static void main(String[] args)throws IOException 
	{
		Scanner s = new Scanner(System.in);
		System.err.println("error msg");
		//int i = s.nextInt();
	    int i = System.in.read();
		System.out.println(String.valueOf(i));
		System.out.println("Enter pattern");
		Pattern p = Pattern.compile(s.nextLine());
		System.out.println("Enter text");
		Matcher m = p.matcher(s.nextLine());
		//boolean b = false;
		
		if(m.find())
		{
			System.out.println("text found \t"+m.group()+"\tstart at \t"+m.start()+"\tend at \t"+m.end());
			//b = true;	
		}
		else
		{
			System.out.println("not found");
		}
		
		//System.out.println(b);
	}

 }
