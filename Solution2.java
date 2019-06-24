public class Solution2 {
    public static void main(String[] args) {
        new Solution2().sumOfAscii(args[1]);
    }

    public long sumOfAscii(String arg) {
        long toRet = 0;
        for (int i = 0; i < arg.length(); ++i) {
            toRet += arg.charAt(i);
        }
        return toRet;
    }
}
