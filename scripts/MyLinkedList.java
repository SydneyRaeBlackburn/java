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
    Append Methods
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
    
    /*
     End of Append Methods
     */
    
    /*
     Delete Methods
     */
    
    // Deletes first occurence of data
    void deleteData(LinkedListNode<T> head, T data) {
        LinkedListNode<T> curr_node = head, prev_node = null;
        
        // Find the node that holds the data
        while (curr_node != null && curr_node.data != data) {
            prev_node = curr_node;
            curr_node = curr_node.next;
        }
        if (curr_node == null) return; // Data not in list
        if (curr_node == head) head = head.next; // Remove first node
        else prev_node.next = curr_node.next;
        return;
    }
    
    // Deletes node at a specific location
    void deleteNode(int position) {
        if (head == null) return; // Empty list
        
        LinkedListNode<T> temp = head;
        if (position == 0) { // Remove first node
            head = temp.next;
            return;
        }
        
        // Find node at position before node to be deleted
        for (int i = 0; temp!= null && i < position - 1; i++)
            temp = temp.next;
        
        if (temp == null || temp.next == null) return; // Index out of bounds
        LinkedListNode<T> next = temp.next.next;
        temp.next = next;
    }
    
    /*
     End of Delete Methods
     */
    
    // Checks whether the data is present in the Linked List
    boolean search(LinkedListNode<T> head, T data) {
        if (head == null) return false; // Empty list
        if (head.data == data) return true;
        return search(head.next, data); // seach Linked List recursively
    }
}
