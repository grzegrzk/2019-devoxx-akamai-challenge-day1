public class Solution3 {
    public static void main(String[] args) {
        System.out.print(new Solution3().nthFibonacci(Long.parseLong(args[0])));
    }

    public long nthFibonacci(long n) {
        long prev1 = 0;
        long cur = 1;
        if (n == 0) {
            return prev1;
        }
        if (n == 1) {
            return cur;
        }
        for (int i = 2; i <= n; ++i) {
            long temp = prev1;
            prev1 = cur;
            cur = prev1 + temp;
        }
        return cur;
    }
}
