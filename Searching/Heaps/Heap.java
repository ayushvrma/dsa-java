package Searching.Heaps;

public class Heap {
    private int heap[];
    private int size;

    public Heap(int capacity)
    {
        heap = new int[capacity];
    }

    public void insert(int value){
        if(isFull()){
            throw new IndexOutOfBoundsException("Heap is Full");
        }

        heap[size++]=value;

        fixHeapAbove(size);
        size++;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int getChild(int index, boolean left){
        return 2* index + (left?1:2); //if its left we want 1 right we want 2 (formula)
    }

    public int delete(int index){ //usuallyu done with root
        if(isEmpty()){
            throw new IndexOutOfBoundsException("heap is empty");
        }
        int parent = getParent(index);
        int deletedValue = heap[index];

        heap[index] = heap[size-1]; //right most value will replace whatever is at the index

        if(index ==0 || heap[index]<heap[parent]){
            fixHeapBelow(index, size-1);
         }
         else{
             fixHeapAbove(index);
         }
         size--;

         return deletedValue;

    }

    public void printHeap(){
        for(int i=0; i<size ; i++){
            System.out.print(heap[i]+" ,");
        }
        System.out.println();
    }

    private void fixHeapBelow(int index, int lastHeapIndex){
        int childToSwap;

        while(index<=lastHeapIndex){
            int leftChild = getChild(index, true);
            int rightChild =getChild(index, false);

            if(leftChild<= lastHeapIndex){
                if(rightChild> lastHeapIndex) //means it does not have a right child, means we want to swap the left child
                {
                    childToSwap = leftChild;
                }
                else{
                    childToSwap = (heap[leftChild]> heap[rightChild])?leftChild:rightChild; //assigning with the child having the greatest value
                }
                if(heap[index]<heap[childToSwap]){
                    int temp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = temp;
            }
            else{//if the value is already greater than its child then we are good to go
                break;
            }
            index = childToSwap;

            }
            else{
                break;
            }
        }
    }

    private void fixHeapAbove (int index){
        int newValue = heap[index];
        while(index>0 && newValue> heap[getParent(index)]){//means weve hit the root
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        heap[index] = newValue;
    }

    public boolean isFull(){
        return size==heap.length;
    }

    public int getParent(int index){
        return (index-1)/2;
    }
}
