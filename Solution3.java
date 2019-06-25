import java.math.BigInteger;

public class Solution3 {
//    private static final BigDecimal TWO = new BigDecimal(2);
//    private static final int MAX_SQRT_ITERS = 1_000_000_000;

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

//    public BigInteger nthFibonacci(long n) {
//
//
//        BigDecimal SQRT_5 = sqrt(new BigDecimal("5"), 300);
//        BigDecimal coeff1 =
//                BigDecimal.ONE.add(SQRT_5)
//                        .divide(TWO, RoundingMode.HALF_EVEN);
//
//        BigDecimal coeff2 =
//                BigDecimal.ONE.subtract(SQRT_5)
//                        .divide(TWO, RoundingMode.HALF_EVEN);
//
//        BigDecimal toRet = coeff1.pow((int) n).subtract(coeff2.pow((int) n)).divide(SQRT_5, RoundingMode.HALF_EVEN);
//        toRet = toRet.add(new BigDecimal("0.49"));
//
//        return toRet.toBigInteger();
//
////        BigInteger prev1 = BigInteger.ZERO;
////        BigInteger cur = BigInteger.ONE;
////        if (n == 0) {
////            return prev1;
////        }
////        if (n == 1) {
////            return cur;
////        }
////        for (int i = 2; i <= n; ++i) {
////            BigInteger temp = prev1;
////            prev1 = cur;
////            cur = prev1.add(temp);
////        }
////        return cur;
//    }
//
//    public static BigDecimal sqrt(BigDecimal A, final int scale) {
//        BigDecimal x0 = new BigDecimal("0");
//        BigDecimal x1 = new BigDecimal(Math.sqrt(A.doubleValue()));
//        int i = 0;
//        while (!x0.equals(x1) && i < MAX_SQRT_ITERS) {
//            x0 = x1;
//            x1 = A.divide(x0, scale, RoundingMode.HALF_UP);
//            x1 = x1.add(x0);
//            x1 = x1.divide(TWO, scale, RoundingMode.HALF_UP);
//            ++i;
//        }
//        return x1;
//    }
}
