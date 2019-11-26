package main;

public class BonusBinarySearch {

    /**
     * A binary search implementation for integer arrays.
     *
     * Info about binary search: https://www.geeksforgeeks.org/binary-search/
     *
     * @param sortedNumbers - must be sorted from least to greatest
     * @param n - number to search for
     * @return index of search item if it's found, -1 if not found
     */

    /*
    // Java implementation of iterative Binary Search
class BinarySearch {
    int binarySearch(int arr[], int x)   public static int binarySearch(int[] sortedNumbers, int n) {
    {
        int l = 0, r = arr.length - 1; int right = sortedNumbers.length - 1;
        while (l <= r) {      while (right > left) {
            int m = l + (r - l) / 2; int mid = left + ((right - left) / 2);

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

            // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }
     */
    public static int binarySearch(int[] sortedNumbers, int n) {
        int right = sortedNumbers.length - 1;
        int left = 0;
        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (sortedNumbers[mid] > n) {
                right = mid - 1;
            } else if (sortedNumbers[mid] < n) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
