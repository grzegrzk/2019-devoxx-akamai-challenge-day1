import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution1Test {

    @Test
    public void test() throws IOException {
        Solution1 s1 = new Solution1();

        assertThat(s1.palindromesCount(reader(""))).isEqualTo(0);
        assertThat(s1.palindromesCount(reader("abc"))).isEqualTo(0);
        assertThat(s1.palindromesCount(reader("abc\nnan\nuku"))).isEqualTo(2);
    }

    private Reader reader(String str) {
        return new StringReader(str);
    }

}
