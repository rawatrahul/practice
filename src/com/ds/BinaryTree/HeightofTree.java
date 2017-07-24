package com.ds.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by rahul.rawat on 6/26/2017.
 */
public class HeightofTree {
    public static int findHeight(Node root) {
        int height = 0;
        if(root==null) return 0;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);
        //null is level marker
        while (!q.isEmpty()){
            root = q.remove();
            if(root==null){

                if(!q.isEmpty())
                    q.add(null);    //level ended, add marker
                height++;
            }
            else {
                if (root.left!=null)
                    q.add(root.left);
                if (root.right!=null)
                    q.add(root.right);
            }
        }
        return height;
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.print(findHeight(root));
    }
}
