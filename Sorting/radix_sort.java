package Sorting;

public class radix_sort {
    public static void main(String[] args) {
        int arr[] = {4725,4586,1330,8792,1594,5729};

        radixSort(arr, 10, 4);

        for(int i=0; i<arr.length;i++)
            System.out.println(arr[i]);
        
    }
    static void radixSort(int[] arr, int radix, int width)
    {
        for(int i=0;i<width; i++)
        {
            radixSingleSort(arr, i, radix);

        }
    }
    static void radixSingleSort(int arr[], int position, int radix){
        int numItems = arr.length;

        int countArray[] = new int[radix];

        for(int value:arr)
        {
            countArray[getDigit(position,value,radix)]++;
        }
        //To adjust the count array
        for(int j=1; j<radix ; j++)
        {
            countArray[j]+= countArray[j-1];
        }

        int temp[] = new int[numItems];

        for(int tempIndex = numItems; tempIndex>=0 ; tempIndex--)
        {
            temp[--countArray[getDigit(position, arr[tempIndex], radix)]] = arr[tempIndex];
        }

        for (int tempIndex = 0; tempIndex<numItems ; tempIndex++)
        {
            arr[tempIndex] = temp[tempIndex];
        }
    }
    static int getDigit(int position, int value, int radix){
        return value/(int) Math.pow(10, position)%radix;
    }
}

/*
Assumes that the data has the same radix and width
radix- no. of unique values (10 in decimal, 2 in binary)
width is the length of digits/characters of a number or word
Used to sort Integers and Strings
Start at rightmost position
We must use a stable sort algorithm at each stage
O(n) often runs slower than O(nlogn)
Stable
In-place
*/
