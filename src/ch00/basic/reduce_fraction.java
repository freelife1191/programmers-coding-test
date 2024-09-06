package ch00.basic;

import java.util.Arrays;

public class reduce_fraction {
    private static int gcd(int num1, int num2) {
        if (num1 % num2==0) return num2;
        return gcd(num2, num1%num2);
    }
    public static void main(String[] args) {
        int numer1 = 9;
        int denom1 = 2;
        int numer2 = 1;
        int denom2 = 3;

        int numer = numer1*denom2 + numer2*denom1;
        int denom = denom1*denom2;
        int gcd = gcd(denom, numer);
        numer = numer/gcd;
        denom = denom/gcd;
        int[] answer = new int[]{numer, denom};
        System.out.println(Arrays.toString(answer));
    }
}
