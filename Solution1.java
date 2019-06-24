import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        Solution1 s1 = new Solution1();
        try (Reader fr = new FileReader(args[0])) {
            System.out.println(
                    s1.palindromesCount(fr)
            );
        }
    }

    public long palindromesCount(Reader reader) throws IOException {
        BufferedReader br = new BufferedReader(reader);
        String line = null;
        long palindromeCount = 0;
        while ((line = br.readLine()) != null) {
            String trimmed = line.trim();
            if (!trimmed.isEmpty() && isPalindrome(trimmed)) {
                ++palindromeCount;
            }
        }
        return palindromeCount;
    }

    private boolean isPalindrome(String word) {
        char[] chars = word.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i < chars.length; ++i) {
            reversed.append(chars[chars.length - i - 1]);
        }
        return reversed.toString().equals(word);
    }
}
