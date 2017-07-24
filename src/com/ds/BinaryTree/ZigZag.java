package com.ds.BinaryTree;

import java.util.Stack;

/**
 * Created by rahul.rawat on 6/12/2017.
 */
public class ZigZag {
    public static void zigzagTraversal(Node root) {
        if (root == null)
            return;
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(root);
        while(!s1.empty() || !s2.empty()){
            while(!s1.empty()){
                Node temp = s1.pop();
                System.out.print(temp.data+" ");
                if(temp.right!=null)
                    s2.push(temp.right);
                if(temp.left!=null)
                    s2.push(temp.left);
            }
            while(!s2.empty()){
                Node temp = s2.pop();
                System.out.print(temp.data+" ");
                if(temp.left!=null)
                    s1.push(temp.left);
                if(temp.right!=null)
                    s1.push(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        zigzagTraversal(root);
    }
}
