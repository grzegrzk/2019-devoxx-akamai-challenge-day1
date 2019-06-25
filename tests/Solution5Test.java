import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution5Test {

    @Test
    public void test() {
        Solution5 s5 = new Solution5();

        assertThat(s5.isVampire(1259)).isEqualTo(false);
        assertThat(s5.isVampire(1260)).isEqualTo(true);
        assertThat(s5.isVampire(1261)).isEqualTo(false);
        assertThat(s5.isVampire(126000)).isEqualTo(false);
    }

    @Test
    public void testNth() {
        Solution5 s5 = new Solution5();

        assertThat(s5.nthVampireNumber(1)).isEqualTo(1260);
        assertThat(s5.nthVampireNumber(2)).isEqualTo(1395);
        assertThat(s5.nthVampireNumber(3)).isEqualTo(1435);
        assertThat(s5.nthVampireNumber(4)).isEqualTo(1530);
        assertThat(s5.nthVampireNumber(5)).isEqualTo(1827);
        assertThat(s5.nthVampireNumber(6)).isEqualTo(2187);
        assertThat(s5.nthVampireNumber(7)).isEqualTo(6880);
        assertThat(s5.nthVampireNumber(8)).isEqualTo(102510);
    }


    @Test
    public void testNthBig() {
        Solution5 s5 = new Solution5();

        long curCandidate = 0;
        for (int i = 0; i < 300; ++i) {
            long newResult = s5.findVampireNumberNotSmallerThan(curCandidate + 1);
            System.out.println(String.format("%s: %s", i, newResult));
            curCandidate = newResult;
        }
    }
}
