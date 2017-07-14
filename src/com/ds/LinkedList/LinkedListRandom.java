package com.ds.LinkedList;

/**
 * Created by rahul.rawat on 6/4/2017.
 */
class LLRNode {
    int data;
    LLRNode next;
    LLRNode random;

    LLRNode(int data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }
}

public class LinkedListRandom {
    public static void print(LLRNode head) {
        LLRNode node = head;
        if (node == null)
            return;
        while (node.next != null) {
            System.out.println("Data: " + node.data + " Next: " + node.next.data + " Random: " + node.random.data);
            node = node.next;
        }
    }

    public static LLRNode clone(LLRNode head) {
        LLRNode curr = head;
        LLRNode temp = null;
        while (curr != null) {
            temp = curr.next;
            curr.next = new LLRNode(curr.data);
            curr.next.next = temp;
            curr = temp;
        }
        curr = head;
        while (curr != null) {
            curr.next.random = curr.random.next;
            curr = curr.next != null ? curr.next.next : curr.next;
        }
        LLRNode orig = head;
        LLRNode copy = head.next;
        temp = copy;
        while (orig != null && copy != null) {
            orig.next=orig.next!=null?orig.next.next:orig.next;
            copy.next=copy.next!=null?copy.next.next:copy.next;
            orig=orig.next;
            copy=copy.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        LLRNode head = new LLRNode(1);
        head.next = new LLRNode(3);
        head.next.next = new LLRNode(7);
        head.next.next.next = new LLRNode(18);
        head.next.next.next.next = new LLRNode(10);

        head.random =head.next.next;
        head.next.random = head;
        head.next.next.random = head.next.next.next.next;
        head.next.next.next.random =head.next.next.next;
        head.next.next.next.next.random = head.next;

        print(head);
        System.out.println("\nAfter Cloning:");
        print(clone(head));
    }
}
