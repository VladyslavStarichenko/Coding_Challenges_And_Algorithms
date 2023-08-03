package leetcode;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        String test1 = "abcdc";
        String test2 = "gadcc";

        System.out.println(longestCommonSubsequence(test1, test2));
    }

//TODO correct answer
    public static int longestCommonSubsequence(String text1, String text2) {
        if (text1.length() == 0 || text2.length() == 0) {
            return 0;
        }

        int[] memo = new int[text2.length()];

        for (int i = 0; i < text1.length(); i++) {
            int prev = 0;
            for (int j = 0; j < text2.length(); j++) {
                int temp = memo[j];
                if (text1.charAt(i) == text2.charAt(j)) {
                    memo[j] = prev + 1;
                } else {
                    memo[j] = Math.max(memo[j], j > 0 ? memo[j - 1] : 0);
                }
                prev = temp;
            }
        }

        return memo[text2.length() - 1];
    }

//    public static int longestCommonSubsequence(String text1, String text2) {
//        int[] memo = new int[text2.length() + 1];
//        char[] t1c = text1.toCharArray(), t2c = text2.toCharArray();
//        for (int i = t1c.length - 1; i > -1; i--) {
//            int previousRight = 0, newRight = 0;
//            for (int j = t2c.length - 1; j > -1; j--) {
//                int tmp = memo[j];
//                int max;
//                if (t1c[i] == t2c[j]) max = previousRight + 1;
//                else max = Math.max(tmp, newRight);
//                memo[j] = newRight = max;
//                previousRight = tmp;
//            }
//        }
//        return memo[0];
//    }

//    public static int longestCommonSubstring(String text1, String text2) {
//        int[] memo = new int[text2.length() + 1];
//        char[] t1c = text1.toCharArray();
//        char[] t2c = text2.toCharArray();
//        for(int i = 0; i < text1.length(); i++ ){
//            int previousRight = 0, newRight = 0;
//            for(int j = 0; j < text2.length(); j++){
//                int tmp = memo[j];
//                int max;
//                if (t1c[i] == t2c[j]){
//                    max = previousRight++;
//                }else {
//                    max = Math.max(tmp, newRight);
//                    memo[j] = newRight = max;
//                    previousRight = tmp;
//                }
//
//            }
//
//        }
//        return memo[0];
//    }


    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


}
