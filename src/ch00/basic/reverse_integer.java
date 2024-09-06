package ch00.basic;

public class reverse_integer {
    public static int reverse(int x) {
        int answer = 0;

        while (x != 0) {
            int overflowCheck = answer * 10 + x % 10;
            System.out.println(String.format("overflowCheck:%d, x:%d", overflowCheck, x));
            if ((overflowCheck - x % 10) / 10 != answer) {
                return  0;
            }

            x /= 10;
            answer = overflowCheck;

        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(reverse(2365));
        System.out.println("====================================");
        // 자릿수 유지 때문에 answer에 overflowCheck 값을 넣어서 반복때마다 자릿수를 늘려나간다
        // 반면에 x의 숫자는 10으로 나누어 자릿수를 줄여 나간다
        // * 10을 해서 10의 배수로 만든다음 x를 더하고 에서 % 10을 하면 10의 배수가 모두 사라지고 나머지만 남는다
        // 숫자가 가장 끝숫자이다 반복하면 가장 끝숫자가 점점 앞으로 간다
        System.out.println(0 * 10 + 2365 % 10);

        System.out.println(5 * 10 + 236 % 10);
        System.out.println(56 * 10 + 23 % 10);
        System.out.println(563 * 10 + 2 % 10);
    }
}
