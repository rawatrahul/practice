package com.ds.BinaryTree;


/**
 * Created by rahul.rawat on 7/17/2017.
 */

public class CheckBST {
    public static boolean checkBST(Node root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean isBSTUtil(Node root, int min, int max) {
        if (root == null) return true;
        if (root.data > max || root.data < min) return false;
        return (isBSTUtil(root.left, min, root.data - 1) && isBSTUtil(root.right, root.data + 1, max));
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);


        if (checkBST(root))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }
}