/******************************************************************
 *
 *   Michael Simmons / COMP272-400C
 *
 *   This java file contains the problem solutions of isSubSet, findKthLargest,
 *   and sort2Arrays methods. You should utilize the Java Collection Framework for
 *   these methods.
 *
 ********************************************************************/

import java.util.*;

class ProblemSolutions {

    /**
     * Method: isSubset()
     *
     * Given two arrays of integers, A and B, return whether
     * array B is a subset if array A. Example:
     *      Input: [1,50,55,80,90], [55,90]
     *      Output: true
     *      Input: [1,50,55,80,90], [55,90, 99]
     *      Output: false
     *
     * The solution time complexity must NOT be worse than O(n).
     * For the solution, use a Hash Table.
     *
     * @param list1 - Input array A
     * @param list2 - input array B
     * @return      - returns boolean value B is a subset of A.
     */

    public boolean isSubset(int list1[], int list2[]) {

        // Create a Hashset to store list1
        HashSet<Integer> set = new HashSet<>();
        // Add each item in list1 to the set
        for (int num : list1) {
            set.add(num);
        }
        // Compare list2 to the set. If there's any conflicts, we can stop and return false
        // Otherwise, return true after the loop is done.

        for (int num : list2) {
            if (!set.contains(num)) {
                return false;
            }
        }

        return true;
    }


    /**
     * Method: findKthLargest
     *
     * Given an Array A and integer K, return the k-th maximum element in the array.
     * Example:
     *      Input: [1,7,3,10,34,5,8], 4
     *      Output: 7
     *
     * @param array - Array of integers
     * @param k     - the kth maximum element
     * @return      - the value in the array which is the kth maximum value
     */

    public int findKthLargest(int[] array, int k) {

        // Sort the array
        Arrays.sort(array);
        // Return the element at length - k
        return array[array.length - k];
    }


    /**
     * Method: sort2Arrays
     *
     * Given two arrays A and B with n and m integers respectively, return
     * a single array of all the elements in A and B in sorted order. Example:
     *      Input: [4,1,5], [3,2]
     *      Output: 1 2 3 4 5
     *
     * @param array1    - Input array 1
     * @param array2    - Input array 2
     * @return          - Sorted array with all elements in A and B.
     */

    public int[] sort2Arrays(int[] array1, int[] array2) {
        // Create a new array to store the merged arrays
        int[] mergedArrays = new int[array1.length + array2.length];

        // I think it's faster to sort after we copy the elements to the new array
        // Copy the elements from array1 to mergedArrays
        System.arraycopy(array1, 0, mergedArrays, 0, array1.length);
        // Copy the elements from array2 to mergedArrays
        System.arraycopy(array2, 0, mergedArrays, array1.length, array2.length);

        // Merge both arrays
        Arrays.sort(mergedArrays);
        return mergedArrays;
    }

}