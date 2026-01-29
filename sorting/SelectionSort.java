package sorting;

public class SelectionSort implements Sorter {

    public void sort(int[] input) 
    {
        System.out.println("Selection Sort!!!");
        int length = input.length();
        for(int i=0; i< length; i++)
        {
            int min = input[i];
            int indexOfMin = i;
            for (int j = i+1; j<length-1; j++)
            {
                if(input[j]<min)
                {
                    min = input [j];
                    indexOfMin = j;
                }
            }
        }
        swap(input, i, indexOfMin);   
    }
    public static void swap(int[]input, int a, int b)
    {
        int temp = input[a];
        input[a] = input[b];
        input[b] = temp;    
    }
}