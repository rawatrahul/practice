package com.ds.LinkedList;

/**
 * Created by rahul.rawat on 7/19/2017.
 */
public class EvenOdd {

    public static void main(String[] args) {
        LLNode head = new LLNode(1);
        head.next = new LLNode(2);
        head.next.next = new LLNode(3);
        head.next.next.next = new LLNode(4);
        head.next.next.next.next = new LLNode(5);
        head.next.next.next.next.next = new LLNode(6);
        head.next.next.next.next.next.next = new LLNode(7);
        print(head);
        head = evneOdd(head);
        print(head);
    }

    private static LLNode evneOdd(LLNode head) {
        LLNode evenHead, oddHead, evenLast, oddLast;
        evenHead = oddHead = evenLast = oddLast = null;
        if (head == null) return null;
        LLNode cur = head;
        while (cur != null) {
            if (cur.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = cur;
                    evenLast = cur;
                } else {
                    evenLast.next = cur;
                    evenLast = cur;
                }
            } else {
                if (oddHead == null) {
                    oddHead = cur;
                    oddLast = cur;
                } else {
                    oddLast.next = cur;
                    oddLast = cur;
                }
            }
            cur = cur.next;
        }
        head = evenHead;
        evenLast.next = oddHead;
        oddLast = null;
        return head;
    }

    public static void print(LLNode head) {
        LLNode node = head;
        if (node == null)
            return;
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println();
    }
}
