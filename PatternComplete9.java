/*

**        **
 **      **
  **    **
   **  **
    ****

*/class PatternComplete9 
{
	public static void main(String[] args) 
	{
		int space=-1;
		int space2=10;

		for (int i=1;i<=5 ;i++ )
		{
			space++;
			space2-=2;
			for (int a=1;a<=space ;a++ )
			{
				System.out.print(" ");
			}
			System.out.print("**");
			for (int c=1;c<=space2 ;c++ )
			{
				System.out.print(" ");
			}
			System.out.print("**");
			System.out.println();
		}
	}
}
