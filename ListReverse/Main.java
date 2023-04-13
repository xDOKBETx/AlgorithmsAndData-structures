package ListReverse;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        
        System.out.println("Original list:");
        list.printList();
        
        list.reverse();
        
        System.out.println("Reversed list:");
        list.printList();
    }
}
