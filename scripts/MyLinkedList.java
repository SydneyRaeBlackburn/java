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
    Append functions
     */
    
    void appendToHead(T data) {
        LinkedListNode<T> new_node = new LinkedListNode<T>(data);
        new_node.next = head;
        head = new_node;
        return;
    }
    
    // Appends new node at location after prev_node
    void appendAtLocation(LinkedListNode<T> prev_node, T data) {
        if (prev_node == null) return;
        LinkedListNode<T> new_node = new LinkedListNode<T>(data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
        return;
    }
    
    void appendToTail (T data) {
        LinkedListNode<T> new_node = new LinkedListNode<T>(data);
        if (head == null) { // empty list
            head = new_node;
            return;
        }
        new_node.next = null;
        LinkedListNode<T> last = head;
        while (last.next != null) { // find last node in list
            last = last.next;
        }
        last.next = new_node;
        return;
    }
}
