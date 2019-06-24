import org.junit.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution4Test {

    @Test
    public void test() {
        Solution4 s4 = new Solution4();
        assertThat(s4.nthLookAndSay(1)).isEqualTo("1");
        assertThat(s4.nthLookAndSay(2)).isEqualTo("11");
        assertThat(s4.nthLookAndSay(3)).isEqualTo("21");
        assertThat(s4.nthLookAndSay(4)).isEqualTo("1211");
        assertThat(s4.nthLookAndSay(5)).isEqualTo("111221");
        assertThat(s4.nthLookAndSay(6)).isEqualTo("312211");
        assertThat(s4.nthLookAndSay(7)).isEqualTo("13112221");
        assertThat(s4.nthLookAndSay(8)).isEqualTo("1113213211");
        assertThat(s4.nthLookAndSay(20)).isEqualTo("11131221131211132221232112111312111213111213211231132132211211131221131211221321123113213221123113112221131112311332211211131221131211132211121312211231131112311211232221121321132132211331121321231231121113112221121321133112132112312321123113112221121113122113121113123112112322111213211322211312113211");
    }

    @Test
    public void testSum(){
        Solution4 s4 = new Solution4();
        assertThat(s4.sumOfDigits("1211")).isEqualTo(new BigInteger("5"));
        assertThat(s4.sumOfDigits("1113213211")).isEqualTo(new BigInteger("16"));
    }
}
