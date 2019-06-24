import java.math.BigDecimal;
import java.util.Arrays;

public class Solution5 {
    public static void main(String[] args) {
        System.out.println(new Solution5().nthVampireNumber(Integer.parseInt(args[0]) + 1));
    }

    public long nthVampireNumber(int n) {
        long curCandidate = 0;
        for (int i = 0; i < n; ++i) {
            curCandidate = findVampireNumberNotSmallerThan(curCandidate + 1);
        }
        return curCandidate;
    }

    public long findVampireNumberNotSmallerThan(long min) {
        long cur = min;
        while (!isVampire(cur)) {
            ++cur;
        }
        return cur;
    }

    public boolean isVampire(long candidate) {
        String candidateAsString = String.valueOf(candidate);
        if (candidateAsString.length() % 2 == 1) {
            return false;
        }
        int[] sortedOriginalDigits = getSortedDigits(candidateAsString);
        int factorizedLength = candidateAsString.length() / 2;
        long minFactorized = BigDecimal.ONE.movePointRight(factorizedLength - 1).longValue();
        long maxFactorized = minFactorized * 10 - 1;
        for (long candidateFactor = minFactorized; candidateFactor <= maxFactorized; ++candidateFactor) {
            long div = candidate / candidateFactor;
            long mod = candidate % candidateFactor;
            if (mod == 0 && (div >= minFactorized && div <= maxFactorized)) {
                if (
                        (candidateFactor % 10 > 0 || div % 10 > 0)
                                && Arrays.equals(
                                sortedOriginalDigits,
                                getSortedDigits(String.valueOf(candidateFactor) + String.valueOf(div))
                        )
                ) {
                    return true;
                }
            }
        }
        return false;
    }

    private int[] getSortedDigits(String string) {
        int[] digits = new int[string.length()];
        long num = Long.parseLong(string);
        int i = 0;
        while (num > 0) {
            digits[i++] = (int) (num % 10);
            num = num / 10;
        }
        Arrays.sort(digits);
        return digits;
    }
}

