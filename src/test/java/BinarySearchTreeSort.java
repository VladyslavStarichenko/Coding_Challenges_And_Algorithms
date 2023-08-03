import java.util.Arrays;

public class BinarySearchTreeSort {

    // Definition of a Binary Tree Node
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void sort(int[] arr) {
        // Create an empty Binary Search Tree
        TreeNode root = null;

        // Insert all items into the Binary Search Tree
        for (int i = 0; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }

        // Traverse the Binary Search Tree in-order to retrieve the items in sorted order
        int i = 0;
        traverseInOrder(root, arr, i);
    }

    // Insert a new key into the Binary Search Tree
    private static TreeNode insert(TreeNode root, int key) {
        if (root == null) {
            return new TreeNode(key);
        }

        if (key < root.val) {
            root.left = insert(root.left, key);
        } else if (key > root.val) {
            root.right = insert(root.right, key);
        }

        return root;
    }

    // Traverse the Binary Search Tree in-order to retrieve the items in sorted order
    private static int traverseInOrder(TreeNode root, int[] arr, int i) {
        if (root == null) {
            return i;
        }

        i = traverseInOrder(root.left, arr, i);
        arr[i++] = root.val;
        i = traverseInOrder(root.right, arr, i);

        return i;
    }

    // Test the sorting algorithm
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 6, 9 };
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
