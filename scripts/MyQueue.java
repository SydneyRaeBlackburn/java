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
}
