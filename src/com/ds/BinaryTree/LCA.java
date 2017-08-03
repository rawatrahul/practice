package com.ds.BinaryTree;

/**
 * Created by rahul.rawat on 6/26/2017.
 */
public class LCA {
    public static Node lca(Node root, Node n1, Node n2) {
        if (root == null) return null;
        if (root == n1 || root == n2) return root;
        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);
        if (left != null && right != null) return root;
        if (left == null && right == null) return null;
        return left!=null?left:right;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.print(lca(root, root.right.right, root.left.left).data);
    }
}
