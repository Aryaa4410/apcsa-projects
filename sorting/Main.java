package sorting;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        int[] testInput = randomArray(5);
        Random random = new Random();
        for(int i =0; i< testInput.length; i++)
        {
            testInput[i]= random.nextInt(5);
        }
        // Increase the loop count to get better results once it works.
        // TestSuite.run(testInput, 10000);
        TestSuite.run(testInput, 1);
    }

    public static int[] randomArray(int length)
    {
        // DO: make this return an actual random array of the provided length.
        int[] a = {10, 5, 3, 2};
        return a;
    }

}
