package ch00.basic;

import java.util.Map;
import java.util.function.BiFunction;

public class condition_string {
    public static void main(String[] args) {
        String ineq = ">";
        String eq = "!";
        int n = 41;
        int m = 78;
        Map<String, BiFunction<Integer, Integer, Boolean>> functions = Map.of(
                ">=", (a, b) -> a >= b,
                "<=", (a, b) -> a <= b,
                ">!", (a, b) -> a > b,
                "<!", (a, b) -> a < b
        );

        System.out.println(functions.get(ineq + eq).apply(n, m) ? 1 : 0);
    }
}
