import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution2Test {

    @Test
    public void test() {
        Solution2 sut = new Solution2();

        assertThat(sut.sumOfAscii("a")).isEqualTo(97);
        assertThat(sut.sumOfAscii("aa")).isEqualTo(97 * 2);
        assertThat(sut.sumOfAscii("0")).isEqualTo(48);
        assertThat(sut.sumOfAscii("1")).isEqualTo(49);
        assertThat(sut.sumOfAscii("01")).isEqualTo(97);
    }
}
