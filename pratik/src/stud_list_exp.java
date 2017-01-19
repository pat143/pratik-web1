import java.util.ArrayList;
import java.util.HashSet;

import java.util.Scanner;
public class stud_list_exp
{
	public static void main(String[] args)
	{
		 char c='y';
		Scanner s=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<String>();
		
		System.out.println("Enter name");
		do
		{
			if(c=='y')
			{
				al.add(s.nextLine());
				System.out.println("do u want");
				c=s.next().charAt(0);
			}	
		}while(c=='y');
		 HashSet<String> h=new HashSet<String>();
		 h.addAll(al);
		 
		  System.out.println(h);  
	}

}
