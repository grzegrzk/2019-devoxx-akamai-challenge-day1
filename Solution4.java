import java.util.List;

public class Solution4 {
    public static void main(String[] args) {
        System.out.println(new Solution4().nthLookAndSay(Integer.parseInt(args[0])));
    }

    public String nthLookAndSay(int n) {
        String cur = "1";
        for (int i = 1; i < n; ++i) {
            cur = computeNextLookAndSay(cur);
        }
        return cur;
    }

    public String computeNextLookAndSay(String cur) {
        StringBuilder next = new StringBuilder();
        for (int i = 0; i < cur.length(); ) {
            int count = 1;
            while (i + count < cur.length() && cur.charAt(i + count) == (cur.charAt(i))) {
                ++count;
            }
            next.append(count);
            next.append(cur.charAt(i));
            i = i + count;
        }
        return next.toString();
    }
}
