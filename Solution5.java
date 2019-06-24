public class Solution5 {
    public static void main(String[] args) {
//        System.out.println(new Solution5().nthVampireNumber(Integer.parseInt(args[0])));
    }

//    private long nthVampireNumber(int n) {
//        long curCandidate = 0;
//        for (int i = 0; i < n; ++i) {
//            curCandidate = findVampireNumberLargerThen(curCandidate);
//        }
//        return curCandidate;
//    }
//
//    private long findVampireNumberLargerThen(long min) {
//        long cur = min;
//        while (!isVampire(cur)) {
//            ++cur;
//        }
//        return cur;
//    }
//
//    private boolean isVampire(long candidate) {
//        String candidateAsString = String.valueOf(candidate);
//        if (candidateAsString.length() % 2 == 1) {
//            return false;
//        }
//        String firstHalf = candidateAsString.substring(0, candidateAsString.length() / 2);
//        String secondHalf = candidateAsString.substring(candidateAsString.length() / 2);
//
//    }
}
