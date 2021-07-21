package array;
class array
{
    public static void main(String[] args) {
        int arr[] = new int[7];

        for(int i=0; i< arr.length ; i++)
        arr[i] = 2*i;

        for(int i=0; i< arr.length ; i++)
        System.out.println(arr[i]);
    }
}