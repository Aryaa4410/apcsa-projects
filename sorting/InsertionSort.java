package sorting;

public class InsertionSort implements Sorter 
{

    public void sort(int[] input) 
    {
       System.out.println("Insertion Sort!!!");
       
       for(int i=1; i< input.length; i++)//loops through every number in the array
       {
        int currentValue = input [i];
       
        int j = i-1;
        while(j>=0 && input [j] > currentValue)//this loops to make sure the smallest number is int the front and stops when the numbers are in order
        {
            input[j+1] = input[j];
            j--;
        }
       }
    }
}
 