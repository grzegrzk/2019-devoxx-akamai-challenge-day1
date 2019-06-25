import java.math.BigInteger;

public class Solution8 {
    public static void main(String[] args) {
        System.out.println(new Solution8().calculateBitsInRange(Long.parseLong(args[0])));
    }

    public BigInteger calculateBitsInRange(long maxValue) {
        long totalCount = 0;
        int[] digitCountLookupTable = new int[10];
        for (int i = 0; i < 10; ++i) {
            digitCountLookupTable[i] = countBits(i + '0');
        }
        for (long i = 0; i <= maxValue; ++i) {
            totalCount += loopBodyToKickInJIT(digitCountLookupTable, i);
        }
        return BigInteger.valueOf(totalCount);
    }

    private long loopBodyToKickInJIT(int[] digitCountLookupTable, long i) {
        long count = 0;
        String s = String.valueOf(i);
        for (int j = 0; j < s.length(); ++j) {
            count += digitCountLookupTable[((int) s.charAt(j) - '0')];
        }
        return count;
    }

    public BigInteger calculateBitsInRangeNaive(long maxValue) {
        BigInteger totalCount = BigInteger.ZERO;
        for (long i = 0; i <= maxValue; ++i) {
            String s = String.valueOf(i);
            for (int j = 0; j < s.length(); ++j) {
                totalCount = totalCount.add(BigInteger.valueOf(countBits((int) s.charAt(j))));
            }
        }
        return totalCount;
    }

    private int countBits(int num) {
        int count = 0;
        while (num > 0) {
            count += num % 2;
            num = num / 2;
        }
        return count;
    }
}
