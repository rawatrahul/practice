package com.ds.BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class VerticalOrder {
    static HashMap<Integer,String> hashMap = new HashMap<>();


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        findVerticalOrder(root,0);
        printResult(hashMap);

    }

    private static void findVerticalOrder(Node root, int level) {
        if(root==null) return ;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        hashMap.put(level,hashMap.get(level)+" "+root.data);
        while (!q.isEmpty()){
            Node t = q.remove();
            if(t.left!=null){
              findVerticalOrder(t.left,level-1);
            }
            if(t.right!=null){
                findVerticalOrder(t.right,level+1);
            }
        }
        }
    public static void printResult(HashMap hm) {
        Set<Integer> i = hm.keySet();
        for (int keys : i) {

            System.out.println(keys +" : "+hm.get(keys));
        }
    }
}
