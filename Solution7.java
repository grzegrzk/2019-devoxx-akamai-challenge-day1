public class Solution7 {
    public static void main(String[] args) {
        System.out.println(new Solution7().countCommaSeparatedStrings(args[0]));
    }

    public long countCommaSeparatedStrings(String str) {
        long tokenCount = 1;
        for (int i = 0; i < str.length(); ) {
            boolean alreadyAdvanced = false;
            if (str.charAt(i) == '/') {
                if (i == str.length() - 1) {
                    // - end of string, do not check what is after
                    ++i;
                    alreadyAdvanced = true;
                } else if (str.charAt(i + 1) == '/') {
                    // - double //: both characters should be consumed
                    i += 2;
                    alreadyAdvanced = true;
                } else if (str.charAt(i + 1) == ',') {
                    // - / followed by ',': both characters should be consumed
                    i += 2;
                    alreadyAdvanced = true;
                } else {
                    // - / followed by something different: unspecified? for now just consume this single character
                    i += 1;
                    alreadyAdvanced = true;
                }
            } else if (str.charAt(i) == ',') {
                ++tokenCount;
            }
            if (!alreadyAdvanced) {
                ++i;
            }
        }
        return tokenCount;
    }
}
