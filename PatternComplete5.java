class PatternComplete5 
{
	public static void main(String[] args) 
	{
		int space=-1;
		int star=10;
		for (int i=1;i<=7 ;i++ )
		{
			if (i<=4)
			{
				space++;
				star-=2;
			}
			else
			{
				space--;
				star+=2;
			}
		for (int x=1;x<=space ;x++ )
		{
			System.out.print(" ");
		}
		for (int y=1;y<=star ;y++ )
		{
			System.out.print("*");
		}
		System.out.println();
		}
	}
}
