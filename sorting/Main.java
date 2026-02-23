package sorting;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
       int[]testInput = randomArray(10);
        TestSuite.run(testInput, 1);
    }

    public static int[] randomArray(int length)
    {
        int[] array = new int[length];
        for(int b = 0; b < length; b++)
        {
            array[b] = (int) (Math.random() *9) + 1;
        }
        return array;
    }

}
