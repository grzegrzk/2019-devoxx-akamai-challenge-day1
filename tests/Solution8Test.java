import org.junit.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;


public class Solution8Test {

    Solution8 s8 = new Solution8();

    @Test
    public void test() {

        assertThat(s8.calculateBitsInRange(1)).isEqualTo(BigInteger.valueOf(5));
        assertThat(s8.calculateBitsInRange(2)).isEqualTo(BigInteger.valueOf(8));
        assertThat(s8.calculateBitsInRange(3)).isEqualTo(BigInteger.valueOf(12));
    }

    @Test
    public void testWithNaive() {
        for(int i = 1; i < 200; ++i){
            assertThat(s8.calculateBitsInRange(i)).isEqualTo(s8.calculateBitsInRangeNaive(i));
        }
        for(int i = 1000; i < 1200; ++i){
            assertThat(s8.calculateBitsInRange(i)).isEqualTo(s8.calculateBitsInRangeNaive(i));
        }
    }

    @Test
    public void testBig(){

        //original: ~20S
        //look up table: ~16S
        //look up table + separate func: ~15S
        //look up table + separate func + less frequent BigInteger operations: ~4.5S
        assertThat(s8.calculateBitsInRange(1L<<27)).isEqualTo(BigInteger.valueOf(3813299112L));


    }

    @Test
    public void testBig2(){
        //look up table + separate func + less frequent BigInteger operations: ~10S
        //look up table + separate func + less frequent BigInteger operations 2: ~5.5S
        assertThat(s8.calculateBitsInRange(1L<<28)).isEqualTo(BigInteger.valueOf(7983034424L));
    }

    @Test
    public void testBig3(){
        //look up table + separate func + less frequent BigInteger operations 2: ~10S
        assertThat(s8.calculateBitsInRange(1L<<29)).isEqualTo(BigInteger.valueOf(16434467390L));
    }

    @Test
    public void testBig4(){
        //look up table + separate func + less frequent BigInteger operations 2: ~10S
        assertThat(s8.calculateBitsInRange(1L<<31)).isEqualTo(BigInteger.valueOf(70667459470L));
    }
}
