import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class nonrepeated
{
	public static void main(String[] args)
	{
		String s="channc";
		String word="";
		for(int i=s.length()-1;i>=0;i--)
		{
			word=word+s.charAt(i);
		}
		//int a=word.length();
		HashMap<Character,Integer>  scoreboard=new HashMap<>();
		for (int i = 0; i < word.length(); i++)
		{ 
			char c = word.charAt(i); 
			if (scoreboard.containsKey(c)) 
			{ 
				scoreboard.put(c, scoreboard.get(c) + 1);
			} 
			else 
			{ 
				scoreboard.put(c, 1); 
			} 
			} 
		//System.out.println(scoreboard.c);
		for (int i = 0; i < word.length(); i++) 
		{ 
			char c = word.charAt(i); 
			if (scoreboard.get(c)== 1)
			{
				//System.out.println(scoreboard.get(c));
				System.out.println(c);
				System.exit(0);
			}
			
				//return c;
				
		}

		
	}

}
