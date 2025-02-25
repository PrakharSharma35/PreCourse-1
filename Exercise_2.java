//Space and time complexity : O(1) or constant time push and pop operations take O(1)

class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            //Constructor here
            this.data = data;
        }

    }


    public boolean isEmpty() {
        //Write your code here for the condition if stack is empty.
        if (root == null)
            return true;
        else
            return false;
    }

    public void push(int data) {
        //Write code to push data to the stack.
        StackNode sn = new StackNode(data);
        sn.next = root;
        root = sn;

    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        //Write code to pop the topmost element of stack.
        //Also return the popped element
        int popElement = root.data;
        root = root.next;
        return popElement;
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        return root.data;
    }


    //Driver code4
    //class Main {
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
    //  }
}
