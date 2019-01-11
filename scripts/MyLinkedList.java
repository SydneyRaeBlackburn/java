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
}
