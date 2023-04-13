package ListReverse;
class Node {
    int data;
    Node prev;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    
    void reverse() {
        Node current = head;
        Node temp = null;
        
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        
        if (temp != null) {
            head = temp.prev;
        }
    }
    
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        
        if (head != null) {
            head.prev = newNode;
        }
        
        head = newNode;
    }
}


