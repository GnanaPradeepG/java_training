class LoopExceptMultiplesOf4
{
    public static void main(String[] args)
    {
        for(int i=36; i<=72; i++)
        {
            if((i%4)!=0)
            {
                System.out.println(i);
            }
        }
    }
}