public class Solution2 {
    public static void main(String[] args) {
        System.out.println(new Solution2().sumOfAscii(args[0]));
    }

    public long sumOfAscii(String arg) {
        long toRet = 0;
        for (int i = 0; i < arg.length(); ++i) {
            toRet += arg.charAt(i);
        }
        return toRet;
    }
}
