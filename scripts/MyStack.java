/*
 Generic Stack
*/

class MyStack<T> {
    private StackNode<T> top;
    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;
        
        public StackNode(T data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // Add an item to the top of the stack
    public void push (T data) {
        StackNode<T> new_node = new StackNode<T>(data);
        new_node.next = top;
        top = new_node;
        return;
    }
}
