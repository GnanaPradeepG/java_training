/*

   *
  **
 ***
****

*/
class PatternProgram3_11 
{
	public static void main(String[] args) 
	{
		int star=0;
		int space=4;
		for (int i=1;i<=4 ;i++ )
		{
			space--;
			star++;
			for (int x=1;x<=space ;x++ )
			{
				System.out.print(" ");
			}
			for (int g=1;g<=star ;g++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
