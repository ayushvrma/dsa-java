package Sorting;

public class shell_sort {
    public static void main(String[] args) {
        int arr[] = { 20, 35, -15, 7, 55, 1, -22 };
        for(int gap = arr.length/2; gap>0; gap/=2)
        {
            for(int i= gap; i< arr.length ; i++){
                int newElement = arr[i];
                int j =i;
                
                while(j>= gap && arr[j-gap] > newElement)
                {
                    arr[j] = arr[j-gap];
                    j-=gap;
                }
                arr[j] = newElement;

            }
        }
        for (int i=0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}

/*
Shell sort is a variation of insertion sort as insertion sort required a lot of shifting
I.S chooses which element to insert with a gap value of 1, while S.S choose a larger gap value, as the algorithm runs, the gap is reduced
therefore at the last traversal the gap value will be 1, and we would be performing insertion sort itself but then the array would be more sorted
the way you calculate the gap can reduce the time complexity(common way: Knuth Sequence (3^k -1)/2 )
were gonna initialise the gap to arr.length/2 cause its simple, divide gap value by 2 until we hit 1

Inplace algorithm
worst case: O(n^2) but it usually performs better than that
Unstable algorithm (meanwhile Insertion sort is Stable)
This gapping can also be done with Bubble sort
*/