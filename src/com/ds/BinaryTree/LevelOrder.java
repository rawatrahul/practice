package com.ds.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        findLOT(root);
    }

    private static void findLOT(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node p = q.remove();
            if (p == null) {
                //end of level add new marker
                System.out.println();
                if (!q.isEmpty())
                    q.add(null);
            } else {
                System.out.print(p.data + " ");
                if (p.left != null)
                    q.add(p.left);
                if (p.right != null)
                    q.add(p.right);
            }
        }
    }
}
