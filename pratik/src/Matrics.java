import java.util.*;
public class Matrics {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int c=0,d=0;
		System.out.println("enter c d value");
		c=s.nextInt();
		d=s.nextInt();
		int a[][]=new int[c][d];
		int b[][]=new int[c][d];
		int x[][]=new int[c][d];
		
		
		System.out.println("enter 'a' matrics value");
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<d;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("enter 'b' matrics value");
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<d;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		System.out.println("2 matrics are:");
		System.out.println("matrics 'a'");
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<d;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("matrics 'b'");
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<d;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}

		System.out.println("addition ");
		
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<d;j++)
			{
				x[i][j]=a[i][j]+b[i][j];
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
