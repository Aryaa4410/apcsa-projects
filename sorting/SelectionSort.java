package sorting;

public class SelectionSort implements Sorter {

    public void sort(int[] input) 
    {
        System.out.println("Selection Sort!!!");
        int length = input.length;
        for(int i=0; i< length-1; i++)//this loops through every number in the array
        {
            int min = input[i];
            int indexOfMin = i;
            for (int j = i+1; j<length; j++)//this finds the smallest value of the array
            {
                if(input[j]<min)//makes sure that min is always the smallest number of the array
                {
                    min = input [j];
                    indexOfMin = j;
                }
            }
            swap(input, i, indexOfMin);//swap method to make sure the smallest number is at the front
        }
    }
    public static void swap(int[]input, int a, int b)//swaps the places of the unsorted part of the array with the smallest number in the array
    {
        int temp = input[a];
        input[a] = input[b];
        input[b] = temp;   
    }
}