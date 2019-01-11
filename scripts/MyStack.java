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
}
