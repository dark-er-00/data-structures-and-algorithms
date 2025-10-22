package searchalgorithm;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Found, return index
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 9, 1};
        int key = 9;
        int result = linearSearch(numbers, key);

        if (result == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at index: " + result);
    }
}
