/*

*
***
*****
*******

*/

class  PatternProgram8
{
	public static void main(String[] args) 
	{
		int star=0;
		for(int i=1;i<=7;i++)
		{
			star++;
			if((i%2)!=0)
			{
				for(int j=1;j<=star;j++)
				{	
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}