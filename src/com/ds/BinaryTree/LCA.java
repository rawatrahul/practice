package com.ds.BinaryTree;

/**
 * Created by rahul.rawat on 6/26/2017.
 */
public class LCA {
    public static TNode lca(TNode root, TNode n1, TNode n2) {
        if (root == null) return null;
        if (root == n1 || root == n2) return root;
        TNode left = lca(root.left, n1, n2);
        TNode right = lca(root.right, n1, n2);
        if (left != null && right != null) return root;
        if (left == null && right == null) return null;
        return left!=null?left:right;
    }

    public static void main(String[] args) {
        TNode root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.left.left = new TNode(4);
        root.left.right = new TNode(5);
        root.right.left = new TNode(6);
        root.right.right = new TNode(7);
        System.out.print(lca(root,root.right.right,root.right.left).data);
    }
}
