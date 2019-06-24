import java.math.BigInteger;

public class Solution4 {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        System.out.println(solution4.nthLookAndSaySum(Integer.parseInt(args[0])));
    }

    public BigInteger nthLookAndSaySum(int n) {
        return sumOfDigits(nthLookAndSay(n));
    }

    public BigInteger sumOfDigits(String num) {
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < num.length(); ++i) {
            sum = sum.add(BigInteger.valueOf(num.charAt(i) - '0'));
        }
        return sum;
    }

    public String nthLookAndSay(int n) {
        String cur = "1";
        for (int i = 1; i < n; ++i) {
            cur = computeNextLookAndSay(cur);
        }
        return cur;
    }

    public String computeNextLookAndSay(String cur) {
        StringBuilder next = new StringBuilder();
        for (int i = 0; i < cur.length(); ) {
            int count = 1;
            while (i + count < cur.length() && cur.charAt(i + count) == (cur.charAt(i))) {
                ++count;
            }
            next.append(count);
            next.append(cur.charAt(i));
            i = i + count;
        }
        return next.toString();
    }
}
