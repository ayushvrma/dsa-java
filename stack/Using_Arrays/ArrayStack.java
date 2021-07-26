package stack.Using_Arrays;

public class ArrayStack {
        
        private Employee[] stack;
        private int top; // initialised with 0

        public ArrayStack(int capacity)
        {
            stack = new Employee[capacity];
        }

        public void push(Employee employee)
        {
            if(top==stack.length)
            {
                //need to resize the backing array
                Employee[] newArray = new Employee[2*stack.length];
                System.arraycopy(stack, 0, newArray,0, stack.length);
                stack = newArray;
            }
        }
}

/*
Last in first out
Ideal backing data structure: linked list
eg: pile of notebooks
O(1) for push pop and peek
if we use array then O(n) cause the array may have to be resized
array good when? when memory is tight / no. of elements is known
*/
