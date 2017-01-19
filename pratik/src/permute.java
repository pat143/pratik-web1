import java.util.Scanner;


public class permute 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int k=a-1;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=a;j++)
			{
				if(i==j)
				{
					int x=1;
					while(x<=j)
					{
						System.out.print("/");
						x++;
					}
					int y=1;
					while(y<=j)
					{
						System.out.print("|");
						y++;
					}
				}
			}
			System.out.println("");
		}
		
		for(int i=a;i>=1;i--)
		{
			for(int k=2;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=a;j<=1;j--)
			{
				if(i==j)
				{
					int x=1;
					while(x<=j)
					{
						System.out.print("/");
						x++;
					}
					int y=1;
					while(y<=j)
					{
						System.out.print("|");
						y++;
					}
				}
			}
			System.out.println("");
		}
		
		
	}

}
