class MindTreeEligibility
{
    public static void main(String[] args) 
    {
        double _10thPercent = 65;
        double _12thPercent = 60;
        double degreePercent =65.50;
        {
            if(((_10thPercent>=65) || (_12thPercent>=65)) && (degreePercent>=55))
            {
                System.out.println("You are Eligible for Capgemini");
            }
            else
            {
                System.out.println("You are Not Eligible for Capgemini");
            }
        }
    }
}