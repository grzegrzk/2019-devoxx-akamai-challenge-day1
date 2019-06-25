import java.math.BigInteger;

public class Solution6 {
    private static final BigInteger SEVEN = BigInteger.valueOf(7);
    private static final BigInteger FOUR = BigInteger.valueOf(4);

    public static void main(String[] args) {
        System.out.println(new Solution6().xorRange(new BigInteger(args[0])));
    }

    public BigInteger xorRange(BigInteger n) {
        BigInteger result = SEVEN;
        // Tha pattern repeats every 4th element
        // 7 = 00 00 01 11, res = 00 00 01 11 <--
        // 8 = 00 00 10 00, res = 00 00 11 11
        // 9 = 00 00 10 01, res = 00 00 01 10
        //10 = 00 00 10 10, res = 00 00 11 00
        //11 = 00 00 10 11, res = 00 00 01 11 <--
        //12 = 00 00 11 00, res = 00 00 10 11
        //13 = 00 00 11 01, res = 00 00 01 10
        //14 = 00 00 11 10, res = 00 00 10 00
        //15 = 00 00 11 11, res = 00 00 01 11 <--
        //16 = 00 01 00 00, res = 00 01 01 11
        //17 = 00 01 00 01, res = 00 00 01 10
        //18 = 00 01 00 10, res = 00 01 01 00
        //19 = 00 01 00 11, res = 00 00 01 11 <--
        //20 = 00 01 01 00, res = 00 01 00 11
        //21 = 00 01 01 01, res = 00 00 01 10
        //22 = 00 01 01 10, res = 00 01 00 00
        //23 = 00 01 01 11, res = 00 00 01 11 <--
        BigInteger[] divideAndReminder = n.subtract(SEVEN).divideAndRemainder(FOUR);
        BigInteger curToXor = SEVEN.add(divideAndReminder[0].multiply(FOUR)).add(BigInteger.ONE);
        while (curToXor.compareTo(n) <= 0) {
            result = result.xor(curToXor);
            curToXor = curToXor.add(BigInteger.ONE);
        }
        return result;
    }

    public BigInteger xorRangeNaive(BigInteger n) {
        BigInteger result = SEVEN;
        BigInteger curToXor = SEVEN.add(BigInteger.ONE);
        while (curToXor.compareTo(n) <= 0) {
            result = result.xor(curToXor);
            curToXor = curToXor.add(BigInteger.ONE);
        }
        return result;
    }
}
