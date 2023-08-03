package leetcode;

public class ReverseString {


    public static void main(String[] args) {
        char [] test = {'h','e','l','l','o'};
        System.out.println(test);
        reverseString(test);
        System.out.println(test);
    }

    public static void reverseString(char[] s) {
        int length = s.length;

        for (int i = 0; i < length / 2; i++) {
            char temp = s[i];
            s[i] = s[length - 1 - i];
            s[length - 1 - i] = temp;
        }
    }
}
