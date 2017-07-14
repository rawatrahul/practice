package com.ds.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by rahul.rawat on 6/26/2017.
 */
public class HeightofTree {
    public static int findHeight(TNode root){
        int height = 0;
        if(root==null) return 0;
        Queue<TNode> q = new LinkedList<TNode>();
        q.add(root);
        q.add(null);
        //end of level
        while (!q.isEmpty()){
            root = q.remove();
            if(root==null){

                if(!q.isEmpty())
                    q.add(null);
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
        TNode root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.left.left = new TNode(4);
        root.left.right = new TNode(5);
        root.right.left = new TNode(6);
        root.right.right = new TNode(7);
        System.out.print(findHeight(root));
    }
}
