class PatternProgram3_15
{
	public static void main(String[] args) 
	{
		int star=0;
		int space=10;
		for (int i=1;i<=5 ;i++ )
		{
			star++;
			space-=2;
			for (int x=1;x<=star ;x++ )
			{
				System.out.print("*");
			}
			for (int y=1;y<=space ;y++ )
			{
				System.out.print(" ");
			}
			for (int z=1;z<=star ;z++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
