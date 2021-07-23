// to modify merge sort to descending order

package Sorting;

public class challenge1 {

    public static void main(String[] args) {
        int arr[] = { 20, 35, -15, 7, 55, 1, -22 };
        mergeSort(arr, 0, arr.length);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

    }

    static void mergeSort(int input[], int start, int end) {
        if (end - start < 2) // number of elements is 1
            return;
        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    static void merge(int input[], int start, int mid, int end) {
        if (input[mid - 1] >= input[mid])
            return; // do no merging when the largest element of the left partitioning is smaller
                    // than the smallest element of the right partition i.e the neighbour arrays are
                    // sorted

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int temp[] = new int[end - start];
        while (i < mid && j < end) // drop out after traversing the left OR the right array
        {
            temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++]; // since merge sort is stable, we use =
                                                                                // sign in <=
        }
        // handeling the remaining elements (we dont need to handle the right array
        // cause its already greater, were copying smaller elements)
        System.arraycopy(input, i, input, start + tempIndex, mid - i); // only handles the left array elements if
                                                                       // remaining
        System.arraycopy(temp, 0, input, start, tempIndex);

    }
    
}
