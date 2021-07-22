package Sorting;

public class counting_sort {
    public static void main(String[] args) {
        int arr[] = {2,5,9,8,2,8,7,10,4,3};

        countingSort(arr, 1, 10);

        for(int i=0; i<arr.length;i++)
            System.out.println(arr[i]);
    }

    static void countingSort(int arr[], int min, int max){
        int countingArray[] = new int[max-min +1];
        
        for(int i =0; i < arr.length; i++)
        {
            countingArray[arr[i] -min]++; 
        }
        int j= 0;
        for(int i=min; i<=max; i++)
        {
            while(countingArray[i-min]>0) //write the value in the original array till its count is 0
            {
                arr[j++] = i;
                countingArray[i-min]--;
            }
        }
    }
    
}

/*
Makes assumptions about the values that are being sorted,
assumes that the values are discreet and in a range
cant solve floating or String type values 
usually use it with whole numbers
Counts the number of occurances of each value
make a counting array and then write back to original array
O(n)
NOT In-Place
if we want the sort to be stable, we'll need to do extra steps
*/
