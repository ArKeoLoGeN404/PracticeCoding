package LinkedListPractice;

import java.util.Arrays;
import java.util.List;

public class PracticeDay1 {

    static void printLL(Node head){
        while (head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    static Node insertHead(int val, Node head){
        Node temp = new Node(val, head);
        return temp;
    }

    static Node deleteHead(Node head){

        if (head == null || head.next == null)
            return null;

        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    static int countLength(Node head){

        int count = 0;
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    static boolean searchElement(Node head, int value){
        Node temp = head;
        while (temp.next != null){

            if (temp.data == value)
                return true;

            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        int val = 100;

        Node head = new Node(nums.get(0));
        head.next = new Node(nums.get(1));
        head.next.next = new Node(nums.get(2));
        head.next.next.next = new Node(nums.get(3));


        printLL(head);
        System.out.println("=============");

        Node newHead = insertHead(val, head);

        printLL(newHead);
//        System.out.println("=============");
//
//        Node newHead2 = deleteHead(newHead);

//        printLL(newHead2);
        System.out.printf("length of the LL : %s", countLength(newHead));
        System.out.println();
        System.out.println(searchElement(newHead, 1001));
    }
}
