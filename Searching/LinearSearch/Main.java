package Searching.LinearSearch;

public class Main {
    public static void main(String[] args) {
        int arr[] = {20,35,-15,7,55,1,-22};
        System.out.println("key is present at: "+LinearSearch(arr, 55)+1 +" position");
    }
    public static int LinearSearch(int arr[], int key)
    {
        for(int i=0;i<arr.length; i++){
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
}
