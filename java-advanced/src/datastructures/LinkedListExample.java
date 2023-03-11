package datastructures;

public class LinkedListExample {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        head.next = node2;
        node2.next = node3;

        ListNode.printLinkedList(head);

        //reverse
//        System.out.println("Reversed linked list:");
//        ListNode.printLinkedList(ListNode.reverse(head));

        //prepend
        ListNode newHead = ListNode.prepend(head, 0);
        System.out.println("Added 0 at the beginning");
        ListNode.printLinkedList(newHead);

        //append
        ListNode.append(newHead, 4);
        System.out.println("Added 4 at the end");
        ListNode.printLinkedList(newHead);
    }

}

class ListNode {
    ListNode next;
    int val;
    ListNode(int val) {
        this.val = val;
    }

    public static ListNode prepend(ListNode head, int val) {
        ListNode newHead = new ListNode(val);
        newHead.next = head;
        return newHead;
    }

    public static void append(ListNode head, int val) {
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        ListNode newTail = new ListNode(val);
        tail.next = newTail;
    }

    public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = head.next;//p = 2
        ListNode q = p.next;//q = 3
        head.next = null;

        while (q != null) {
            p.next = head;
            head = p;
            p = q;
            q = q.next;
        }
        p.next = head;
        return p;
    }

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
