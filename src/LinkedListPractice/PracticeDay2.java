package LinkedListPractice;

public class PracticeDay2 {

    static DoublyNode convertArrToDll(int[] arr){
        DoublyNode head = new DoublyNode(arr[0]);
        DoublyNode prev = head;

        for (int i = 1; i < arr.length; i++) {
            DoublyNode temp = new DoublyNode(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    static void printLL(DoublyNode head){
        while (head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }


    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8, 4};
        // Convert the array to a doubly linked list
        DoublyNode head = convertArrToDll(arr);

        // Print the doubly linked list
        System.out.println("Doubly Linked List Initially: ");
        printLL(head);
    }
}
