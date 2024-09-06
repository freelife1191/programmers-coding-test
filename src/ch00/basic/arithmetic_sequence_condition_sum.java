package ch00.basic;

import java.util.stream.IntStream;

public class arithmetic_sequence_condition_sum {
    public static void main(String[] args) {
        int a = 3;
        int d = 4;

        boolean[] included = {true, false, false, true, true};
        System.out.println(IntStream.range(0, included.length).map(idx -> included[idx]?a+(idx*d):0).sum());

        /*
        int[] array = Stream.iterate(3, n -> n + 4)
                .limit(included.length)
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(IntStream.range(0, array.length).filter(i -> included[i]).map(i -> array[i]).sum());
         */
    }
}
