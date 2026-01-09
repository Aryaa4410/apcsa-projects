package warmup;

public class Main 
{
    int totalSum;
    public static void main(String[] args) 
    {
        int totalSum = 0;
        for (int i = 0; i <= 1000; i++)
        {
            if(i % 5 == 0 || i % 3 == 0)
            {
                totalSum+=i;
            }
        }
        System.out.print("The total sum is " +totalSum);
    }
}
