package com.ds.BinaryTree;

import java.util.Stack;

/**
 * Created by rahul.rawat on 6/12/2017.
 */
public class ZigZag {
    public static void zigzagTraversal(TNode root) {
        if (root == null)
            return;
        Stack<TNode> s1 = new Stack<>();
        Stack<TNode> s2 = new Stack<>();
        s1.push(root);
        while(!s1.empty() || !s2.empty()){
            while(!s1.empty()){
                TNode temp = s1.pop();
                System.out.print(temp.data+" ");
                if(temp.right!=null)
                    s2.push(temp.right);
                if(temp.left!=null)
                    s2.push(temp.left);
            }
            while(!s2.empty()){
                TNode temp = s2.pop();
                System.out.print(temp.data+" ");
                if(temp.left!=null)
                    s1.push(temp.left);
                if(temp.right!=null)
                    s1.push(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        TNode root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.left.left = new TNode(4);
        root.left.right = new TNode(5);
        root.right.left = new TNode(6);
        root.right.right = new TNode(7);
        zigzagTraversal(root);
    }
}
