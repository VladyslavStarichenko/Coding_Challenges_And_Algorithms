package leetcode;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] numbers = {1, 7, 8, 14, 15, 17, 20, 25};
        System.out.println(binarySearch(numbers,1));
    }

    private static int binarySearch(int[] numbers, int number2Search) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int middlePosition = (low + high) / 2;
            int middleNumber = numbers[middlePosition];

            if (number2Search == middleNumber) {
                return middlePosition;
            } else if (number2Search < middleNumber) {
                high = middlePosition - 1;
            } else {
                low = middlePosition + 1;
            }
        }
        return -1;
    }
}
