package sorting;

public class InsertionSort implements Sorter 
{

    public void sort(int[] input) 
    {
       System.out.println("Insertion Sort!!!");
       
       for(int i=1; i< input.length; i++)
       {
        int currentValue = input [i];
       
       int j = i-1;
       while(j>=0 && input [j] > currentValue)
       }
    }
}
 