package Sorting;

import java.util.ArrayList;
import java.util.List;

public class bucket_sort {
    public static void main(String[] args) {
        int intArray[] = {54,46,83,66,95,92,43};

    }

    public static void bucketSort(int arr[])
    {
        List<Integer> buckets[] = new List[10];

        for(int i=0; i<buckets.length;i++){
            buckets[i] = new ArrayList<Integer>(); //linkedlist can also be used
        }
        for(int i=0;i<arr.length;i++)
        {
            buckets[hash(arr[i])].add(arr[i]);
        }
    }

    private static int hash(int value){
        return value/(int)10%10; //division will be done first cause of precedense
    }
}

/*
uses hashing
makes assumptions about the data
can sort in O(n) time
performs best when hashed values are evenly distributed (no collisions)
its a generalisation of counting sort
*/