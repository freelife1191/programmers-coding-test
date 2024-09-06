package ch00.basic;

import java.util.Arrays;

public class array_add_element {
    private static int[] addElement(int[] myArray, int element) {
        int[] array = Arrays.copyOf(myArray, myArray.length + 1);
        array[myArray.length] = element;
        return array;
    }

    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        // int[] add_list = {7, 8, 9};
        // int[] array = IntStream.concat(Arrays.stream(num_list), IntStream.of(12)).toArray();
        num_list = addElement(num_list, 12);
        System.out.println(Arrays.toString(num_list));
    }
}
