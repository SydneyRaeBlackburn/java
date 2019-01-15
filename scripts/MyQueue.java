/*
 Generic Queue
*/

class MyQueue<T> {
    private QueueNode<T> first;
    private QueueNode<T> last;
    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;
        
        public QueueNode(T data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // Add an item to the end of the list
    public void add (T data) {
        QueueNode<T> new_node = new QueueNode<T>(data);
        if (last != null) last.next = new_node;
        last = new_node;
        if (first == null) first = last;
        return;
    }
}
