package Sorting;

public class bubble_sort {
    
    public static void main(String[] args) {
        int arr[] = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastUnsortedIndex = arr.length -1; lastUnsortedIndex>0; lastUnsortedIndex--)
        {
            for (int i=0; i<lastUnsortedIndex; i++)
            {
                if(arr[i]>arr[i+1])
                swap(arr,i,i+1);
            }
        }

        //printing the sorted array

        for (int i=0; i<arr.length;i++)
        System.out.println(arr[i]);
        
    }

    static void swap(int arr[], int i, int j)
    {
        if(i==j)
        return;

        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
    
    
}


/* 
Slows when number of elements grows
partitions array into sorted and unsorted
to sort in ascending, move the larger elements to the right, starting the process from index 0
after every traversal of the outer loop, the largest element gets shifted towards the right (larger values bubble to right)
In-place algorithm
O(n^2) - degrades quickly
one of the least efficient algos
stable sort algorithm (swaped only when the element is greater, therefore postitions remain the same)
*/