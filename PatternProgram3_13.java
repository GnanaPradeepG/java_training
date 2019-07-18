/*

    *
   ***
  *****
 *******
*********


*/

class PatternProgram3_13 
{
	public static void main(String[] args) 
	{
		int star=-1;
		int space=5;
		for (int i=1;i<=5 ;i++ )
		{
			star+=2;
			space--;
			for (int x=1;x<=space ;x++ )
			{
				System.out.print(" ");
			}
			for (int y=1; y<=star ;y++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
