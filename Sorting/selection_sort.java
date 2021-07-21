package Sorting;

public class selection_sort {
    public static void main(String[] args) {
        int arr[] = { 20, 35, -15, 7, 55, 1, -22 };

        for(int lastUnsortedIndex = arr.length -1; lastUnsortedIndex>0;lastUnsortedIndex--)
        {
            int largest = 0;
            for(int i=0; i<= lastUnsortedIndex; i++)
            {
                if(arr[i]>arr[largest]){
                largest = i;
                }
                swap(arr, largest, lastUnsortedIndex);
            }
        }
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
        
    }
    
    static void swap(int arr[], int i, int j) {
        if (i == j)
            return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}


/*
assuming the 0th index element to be the largest and then comparing everything to the 0th index and update the value of largest
after 1 traversal, swap the largest element with the last element of the unsorted list
bringing largest elements to the right
min number of swaps
In-place algorithm
O(n^2)
Unstable algorithm
*/