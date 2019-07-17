class  PatternComplete3
{
	public static void main(String[] args) 
	{
		int star=5;
		int space=-1;
		for (int i=1;i<=7 ;i++ )
		{
			if(i<=4)
			{
				star--;
				space++;
			}
			else
			{
				star++;
				space--;
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
