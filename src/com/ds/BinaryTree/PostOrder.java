package com.ds.BinaryTree;

import java.util.Stack;

/**
 * Created by rahul.rawat on 6/9/2017.
 */
public class PostOrder {
    public static void iterativePostOrder(Node root) {
        if(root==null) {
            return;
        }
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        while(!stack.isEmpty()) {
            Node temp = stack.peek();
            if(temp.left==null && temp.right==null) {
                Node pop = stack.pop();
                System.out.print(pop.data + " ");
            }
            else {
                if(temp.right!=null) {
                    stack.push(temp.right);
                    temp.right = null;
                }
                if(temp.left!=null) {
                    stack.push(temp.left);
                    temp.left = null;
                }
            }
        }
        return ;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        iterativePostOrder(root);
    }
}
