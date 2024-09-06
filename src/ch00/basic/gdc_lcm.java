package ch00.basic;

/**
 * 최대 공약수(GCD)
 * 최소 공배수(LCM)
 * https://programmer-chocho.tistory.com/9
 * 유클리드 호제법
 * (a * b)/최대공약수 = 최소공배수
 * 최대 공약수
 * a % b = r
 * b % r = 0 // 최대 공약수 r
 */
public class gdc_lcm {
    public static int gcd(int num1, int num2) {
        if (num1 % num2 == 0) return num2;
        return gcd(num2, num1%num2);
    }
    public static int lcm(int[] arr) {
        if (arr.length == 1) return arr[0];
        int gcd = gcd(arr[0],arr[1]); // 최대 공약수
        int lcm = (arr[0]*arr[1])/gcd; // 최소 공배수
        for (int i = 2; i < arr.length; i++) {
            gcd = gcd(lcm, arr[i]); // 최소 공배수와 다음 숫자와의 최대 공약수
            lcm = (lcm * arr[i]) / gcd; // (최소 공배수 * 다음 숫자) / 최대 공약수 = 최소 공배수
        }
        return lcm;
    }
    public static void main(String[] args) {
        int lcm = lcm(new int[]{3, 5});
        System.out.println(lcm);
    }
}
