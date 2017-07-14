package com.ds.LinkedList;

/**
 * Created by rahul.rawat on 6/11/2017.
 */
public class AlternateSwap {
    public static LLNode swap(LLNode head) {
        if(head==null)
            return null;
        LLNode curr,nxt;
        curr=head;
        while (curr!=null&&curr.next!=null){

        }
        return null;
    }
    public static void main(String[] args) {
        LLNode head = new LLNode(1);
        head.next = new LLNode(3);
        head.next.next = new LLNode(7);
        head.next.next.next = new LLNode(18);
        head.next.next.next.next = new LLNode(10);

    }
}
