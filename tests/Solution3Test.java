import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution3Test {

    @Test
    public void test(){
        Solution3 s3 = new Solution3();

        assertThat(s3.nthFibonacci(0)).isEqualTo(1);
        assertThat(s3.nthFibonacci(1)).isEqualTo(1);
        assertThat(s3.nthFibonacci(2)).isEqualTo(2);
        assertThat(s3.nthFibonacci(3)).isEqualTo(3);
        assertThat(s3.nthFibonacci(4)).isEqualTo(5);
        assertThat(s3.nthFibonacci(5)).isEqualTo(8);
        assertThat(s3.nthFibonacci(6)).isEqualTo(13);
        assertThat(s3.nthFibonacci(7)).isEqualTo(21);
        assertThat(s3.nthFibonacci(8)).isEqualTo(34);
    }
}
