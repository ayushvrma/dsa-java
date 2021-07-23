//sort Strings using radix sort


package Sorting;

public class challenge3 {
    public static void main(String[] args) {
        String arr[] = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        radixSort(arr, 26, 5);

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

    }

    static void radixSort(String[] arr, int radix, int width) {
        for (int i = width-1; i >=0; i--) {
            radixSingleSort(arr, i, radix);

        }
    }

    static void radixSingleSort(String arr[], int position, int radix) {
        int numItems = arr.length;

        int countArray[] = new int[radix];

        for (String value : arr) {
            countArray[getIndex(position, value)]++;
        }
        // To adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        String temp[] = new String[numItems];

        for (int tempIndex = numItems; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getIndex(position, arr[tempIndex])]] = arr[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            arr[tempIndex] = temp[tempIndex];
        }
    }

    static int getIndex(int position, String value) {
        return value.charAt(position) -'a';
    }
    
}
