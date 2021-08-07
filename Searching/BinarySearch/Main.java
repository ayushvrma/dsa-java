package Searching.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int arr[] = {-22,-15,1,7,20,35,55};
        System.out.println("key is present at: " + binarySearch(arr, 20)+ " position");
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
}
//only on sorted arrays
