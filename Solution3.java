public class Solution3 {
    public static void main(String[] args) {
        System.out.println(new Solution3().nthFibonacci(Integer.parseInt(args[0])));
    }

    public long nthFibonacci(int n) {
        long prev1 = 1;
        long cur = 1;
        if (n == 1) {
            return prev1;
        }
        if (n == 2) {
            return cur;
        }
        for (int i = 3; i <= n; ++i) {
            long temp = prev1;
            prev1 = cur;
            cur = prev1 + temp;
        }
        return cur;
    }
}
