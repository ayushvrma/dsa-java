package Searching.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int arr[] = {-22,-15,1,7,20,35,55};
        //System.out.println("key is present at: " + binarySearch(arr, 20)+ " position");
        System.out.println("key is present at: " + reccursiveBinarySearch(arr, 20, 0, arr.length-1) + " position");
    }
    public static int binarySearch(int arr[], int key)
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid = (start+end)/2;
            System.out.println(arr[mid]);
            if(arr[mid]==key)
            {
                return mid+1;
            }
            else if(arr[mid]<key)
            {
                start = mid+1; 
            }
            else{
                end=mid;
            }
        }
        return -1;
    }

    public static int reccursiveBinarySearch(int arr[], int key, int start, int end)
    {
        if(start>=end)
        {
            return -1;
        }
        int mid=(start+end)/2;
        System.out.println(arr[mid]);
        if (arr[mid] == key) {
            return mid + 1;
        } else if (arr[mid] < key) {
            return reccursiveBinarySearch(arr, key, mid+1, end);
        } else {
            return reccursiveBinarySearch(arr, key, start, mid);
        }

    }
}
//only on sorted arrays
