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
    }
}
