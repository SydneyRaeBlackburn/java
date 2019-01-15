/*
 Generic Linked List
*/

class MyLinkedList<T> {
    private LinkedListNode<T> head;
    private static class LinkedListNode<T> {
        private T data;
        private LinkedListNode<T> next;
        
        public LinkedListNode(T data) {
            this.data = data;
            this.next = null;
        }
    }
    
    /*
    Appen functions
     */
    
    void appendToHead (T data) {
        LinkedListNode<T> new_node = new LinkedListNode<T>(data);
        new_node.next = head;
        head = new_node;
        return;
    }
}
