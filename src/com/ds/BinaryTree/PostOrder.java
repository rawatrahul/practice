package com.ds.BinaryTree;

import java.util.Stack;

/**
 * Created by rahul.rawat on 6/9/2017.
 */
public class PostOrder {
    public static void iterativePostOrder(TNode root) {
        if(root==null) {
            return;
        }
        Stack<TNode> stack = new Stack<TNode>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TNode temp = stack.peek();
            if(temp.left==null && temp.right==null) {
                TNode pop = stack.pop();
                System.out.print(pop.data+" ");;
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
        TNode root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.left.left = new TNode(4);
        root.left.right = new TNode(5);
        root.right.left = new TNode(6);
        root.right.right = new TNode(7);
        iterativePostOrder(root);
    }
}
