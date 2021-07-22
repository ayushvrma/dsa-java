package Sorting;
public class quick_sort {
    static void quickSort(int arr[], int start, int end)
    {
        if(end-start<2) //means we are dealing with a single element
        return;

        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex);
        quickSort(arr, pivotIndex+1, end);
    }
    public static int partition(int arr[], int start, int end)
    {
        int pivot = arr[start];
        int i = start;
        int j = end;
        while(i<j)
        {
            while(i<j && arr[--j]>=pivot); //empty loop body to find the first element less than the pivot
            if(i<j)
            {
                arr[i] = arr[j];
            }
            while(i<j && arr[++i]<=pivot); //empty loop to find the first element greater than the pivot
            if(i<j)
            {
                arr[j]  = arr[i];
            }
        }
        arr[j] = pivot;
        return j; //returning the index where we are inserting the pivot
    }
    public static void main(String[] args) {
        int arr[] = { 20, 35, -15, 7, 55, 1, -22 };
        quickSort(arr, 0, arr.length);

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
/*
Divide and conquor algorithm
uses pivot element to partition the array into two parts
Elements less than the pivot will be on left and others on right, therefore pivot is in its sorted position
In-place (merge sort in not in-place)
Alternate travesals from left to right and right to left ensures we dont lose any data
O(nlogn)
Unstable Algorithm
*/