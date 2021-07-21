package Sorting;

public class insertion_sort {
    public static void main(String[] args) {
        int arr[] = { 20, 35, -15, 7, 55, 1, -22 };

        for (int firstUnsortedIndex=1; firstUnsortedIndex<arr.length;firstUnsortedIndex++)
        {
            int newElement = arr[firstUnsortedIndex];
            int i;
            for(i=firstUnsortedIndex;i>0 && arr[i-1]>newElement;i--)
            {
                arr[i] = arr[i-1];
            }
            arr[i] = newElement;
        }
        for (int i=0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
    }

    
}

/*
Grows the sorted portion from left to right
starts by saying the first elements is in the sorted position, therefore unsorted starting index = 1
use temp variable to store the current comparing element and just shift the elements one right after succeful comparision
Inplace algorithm
Stable algorithm
O(n^2)
A lot of shifting in the algo if the smallest element is in the rightmost place
*/