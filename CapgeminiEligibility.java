class CapgeminiEligibility
{
    public static void main(String[] args) 
    {
        double _10thPercent = 90;
        double _12thPercent = 90;
        double degreePercent = 65.50;
        if((_10thPercent>=50) && (_12thPercent>=60) && (degreePercent>=55))
        {
            System.out.println("You are eligible for Capgemini");
        }
        else
        {
            System.out.println("You are not eligible for Capgemini"); 
        }
    }
}