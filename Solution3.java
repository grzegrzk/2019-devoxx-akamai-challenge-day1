import java.math.BigInteger;

public class Solution3 {
    public static void main(String[] args) {
        System.out.print(new Solution3().nthFibonacci(Long.parseLong(args[0])));
    }

    public BigInteger nthFibonacci(long n) {
        BigInteger prev1 = BigInteger.ZERO;
        BigInteger cur = BigInteger.ONE;
        if (n == 0) {
            return prev1;
        }
        if (n == 1) {
            return cur;
        }
        for (int i = 2; i <= n; ++i) {
            BigInteger temp = prev1;
            prev1 = cur;
            cur = prev1.add(temp);
        }
        return cur;
    }
}
