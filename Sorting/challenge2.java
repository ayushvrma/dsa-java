//modify insertion sort to recusion

package Sorting;

public class challenge2 {
    public static void main(String[] args) {
        int arr[] = { 20, 35, -15, 7, 55, 1, -22 };
        insertionSort(arr, 1);
       
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    static void insertionSort(int arr[], int firstUnsortedIndex) {
        if(firstUnsortedIndex>= arr.length)
            return;

        int newElement = arr[firstUnsortedIndex];
        int i;
        for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
            arr[i] = arr[i - 1];
        }
        arr[i] = newElement;
        insertionSort(arr, ++firstUnsortedIndex);
    }
    
}
