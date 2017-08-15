package com.ds.LinkedList;

/**
 * Created by rahul.rawat on 8/15/2017.
 */
public class ReverseKBlocks {
    public static LLNode reverse(LLNode head, int k) {
        if(head==null)
            return null;

        LLNode prev = null, curr, nxt = null;
        curr=head;
        int count = 0;
        while (curr != null && count < k) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        if (nxt != null)
            head.next = reverse(nxt, k);

        return prev;
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
    public static void main(String[] args) {
        LLNode head = new LLNode(1);
        head.next = new LLNode(2);
        head.next.next = new LLNode(3);
        head.next.next.next = new LLNode(4);
        head.next.next.next.next = new LLNode(5);
        head.next.next.next.next.next = new LLNode(6);
        head.next.next.next.next.next.next = new LLNode(7);
        head.next.next.next.next.next.next.next = new LLNode(8);
        head.next.next.next.next.next.next.next.next = new LLNode(9);
        print(head);
        print(reverse(head, 3));

    }
}
