import org.junit.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution6Test {

    @Test
    public void test() {
        Solution6 s6 = new Solution6();

        assertThat(s6.xorRange(BigInteger.valueOf(7))).isEqualTo(BigInteger.valueOf(7));
        assertThat(s6.xorRange(BigInteger.valueOf(8))).isEqualTo(BigInteger.valueOf(15));
        assertThat(s6.xorRange(BigInteger.valueOf(9))).isEqualTo(BigInteger.valueOf(6));
        assertThat(s6.xorRange(BigInteger.valueOf(10))).isEqualTo(BigInteger.valueOf(12));
        assertThat(s6.xorRange(BigInteger.valueOf(11))).isEqualTo(BigInteger.valueOf(7));
        assertThat(s6.xorRange(BigInteger.valueOf(12))).isEqualTo(BigInteger.valueOf(11));
        assertThat(s6.xorRange(BigInteger.valueOf(10))).isEqualTo(BigInteger.valueOf(7 ^ 8 ^ 9 ^ 10));
        assertThat(s6.xorRange(BigInteger.valueOf(59))).isEqualTo(BigInteger.valueOf(7));
        assertThat(s6.xorRange(BigInteger.valueOf(60))).isEqualTo(BigInteger.valueOf(59));
        assertThat(s6.xorRange(BigInteger.valueOf(61))).isEqualTo(BigInteger.valueOf(6));
        assertThat(s6.xorRange(BigInteger.valueOf(62))).isEqualTo(BigInteger.valueOf(56));
        assertThat(s6.xorRange(BigInteger.valueOf(1000))).isEqualTo(BigInteger.valueOf(1007));
        for (int i = 100; i < 2000; ++i) {
            assertThat(s6.xorRange(BigInteger.valueOf(i))).isEqualTo(s6.xorRangeNaive(BigInteger.valueOf(i)));
        }
        for (int i = 10000; i < 10200; ++i) {
            assertThat(s6.xorRange(BigInteger.valueOf(i))).isEqualTo(s6.xorRangeNaive(BigInteger.valueOf(i)));
        }
        assertThat(s6.xorRange(BigInteger.valueOf(1 << 30))).isEqualTo(BigInteger.valueOf((1 << 30) + 7));
        assertThat(s6.xorRange(new BigInteger("1000000000000000000000"))).isEqualTo(new BigInteger("1000000000000000000007"));
    }

    @Test
    public void testPrint() {
        Solution6 s6 = new Solution6();

        for (int i = 7; i < 100; ++i) {
            BigInteger res = s6.xorRangeNaive(BigInteger.valueOf(i));
            System.out.println(String.format("%s: %s (%s)", i, res, Long.toString(res.longValue(), 2)));
        }
    }
}
