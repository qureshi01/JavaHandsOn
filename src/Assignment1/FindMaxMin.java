package Assignment1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaxMin {

    //USING FOR LOOP
    public static void main(String[] args) {
        int[] array = {5,12,34,5,21,0};

        // Assume the first element is the maximum initially
        int max = array[0];
        // Assume the first element is the minimum initially
        int min = array[0];

        for (int i=1;i<array.length;i++){
            if (array[i] > max) {
                max = array[i]; // Update maximum value
            }

            if (array[i] < min) {
                min = array[i]; // Update minimum value
            }
        }

        System.out.println("Maximum Value: "+max);
        System.out.println("Minimum Value: "+min);

        //USING ARRAYS CLASS
        System.out.println("-------------------------");

        int[] numbers = {21,22,33,1,56,7,-1,0};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); //To strings is used to print the array values directly

        int min1=numbers[0];
        int max1=numbers[numbers.length-1];

        System.out.println("Maximum Value: "+max1);
        System.out.println("Minimum Value: "+min1);

        //USING COLLECTION CLASS
        System.out.println("-------------------");

        Integer[] array1={12,22,33,-10,-1,0,100};

        //Convert array to a list

        List<Integer> list = Arrays.asList(array1); // Getting the list view of Array

        //Find the minimum and maximum values
        int min2 = Collections.min(list);
        int max2 = Collections.max(list);

        System.out.println("Maximum Value: "+max2);
        System.out.println("Minimum Value: "+min2);
    }
}
