import org.junit.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution7Test {

    @Test
    public void test() {
        Solution7 s7 = new Solution7();

        assertThat(s7.countCommaSeparatedStrings("a,b")).isEqualTo(2);
        assertThat(s7.countCommaSeparatedStrings("")).isEqualTo(1);
        assertThat(s7.countCommaSeparatedStrings(",,,")).isEqualTo(4);
        assertThat(s7.countCommaSeparatedStrings("a,b,c,c")).isEqualTo(4);
        assertThat(s7.countCommaSeparatedStrings("a/,b,c,c")).isEqualTo(3);
        assertThat(s7.countCommaSeparatedStrings("a/,b/,c,c")).isEqualTo(2);
        assertThat(s7.countCommaSeparatedStrings("a/,b/,c/,c")).isEqualTo(1);
        assertThat(s7.countCommaSeparatedStrings("a//,b/,c/,c")).isEqualTo(2);
        assertThat(s7.countCommaSeparatedStrings("a//,b//,c/,c")).isEqualTo(3);
        assertThat(s7.countCommaSeparatedStrings("a//,b//,c//,c")).isEqualTo(4);
        assertThat(s7.countCommaSeparatedStrings("a//,b///,c//,c")).isEqualTo(3);
        assertThat(s7.countCommaSeparatedStrings("a,b/,c")).isEqualTo(2);
        assertThat(s7.countCommaSeparatedStrings("a//b")).isEqualTo(1);
        assertThat(s7.countCommaSeparatedStrings("a//")).isEqualTo(1);
        assertThat(s7.countCommaSeparatedStrings("a/")).isEqualTo(1);
        assertThat(s7.countCommaSeparatedStrings("a///")).isEqualTo(1);
        assertThat(s7.countCommaSeparatedStrings("a////")).isEqualTo(1);
        assertThat(s7.countCommaSeparatedStrings("a,")).isEqualTo(2);
        assertThat(s7.countCommaSeparatedStrings("a/,")).isEqualTo(1);
        assertThat(s7.countCommaSeparatedStrings("a//,")).isEqualTo(2);
        assertThat(s7.countCommaSeparatedStrings("a///,")).isEqualTo(1);
        assertThat(s7.countCommaSeparatedStrings("a////,")).isEqualTo(2);
    }

}
