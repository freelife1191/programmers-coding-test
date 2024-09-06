package ch00.basic;

public class char_to_int_sum {
    public static void main(String[] args) {
        String num_str = "1000000";
        System.out.println(num_str.chars().map(c -> c - 48).sum());
    }
}
