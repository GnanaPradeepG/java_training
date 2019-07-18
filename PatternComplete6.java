/*

	*
	**
	***
************
*************
************
	***
	**
	*

*/

class PatternComplete6 
{
	public static void main(String[] args) 
	{
		int space=8;
		int ls=8;
		int rs=0;
		for (int i=1;i<=9 ;i++ )
		{
			if(i<=3 ||i>=7)
			{
				for (int a=1;a<=space ;a++ )
				{
					System.out.print(" ");
				}
				
			}
			else
			{
				for (int b=1;b<=ls ;b++ )
				{
					System.out.print("*");
				}
			}
			if(i<=5)
			{
				rs++;
			}
			else
			{
				rs--;
			}
				for (int d=1;d<=rs ;d++ )
				{
					System.out.print("*");
				
				}
		System.out.println();
		}
			
			
	}
}
