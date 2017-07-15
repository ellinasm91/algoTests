package com.ellipiyio;

import javax.swing.tree.TreeNode;

/**
 * Created by mikeellinas on 11/2/16.
 */
public class HelloWorld4_2 {
    class Node{
        public int value;
        public Node[] children;
        //public Boolean visited;
        Node(int name){
            this.value=name;
            this.children=new Node[5];
            //visited=false;
        }
    }

    public static void main(String[] args) {
        System.out.println("came here");
        HelloWorld4_2 h2 = new HelloWorld4_2();
        h2.init();
        return;
    }

    void init() {
        int[] a=new int[]{1,2,3,4,5};

        for (int b: a
             ) {
            System.out.print(b);
        }
        createMinBinTree(a);
    }

    Node createMinBinTree(int[] a){

        if (a==null) return null;

        return null;
    }

    private void addToMinBinTree(int b, TreeNode head) {

    }

    // Minimal Tree: Given a sorted (increasing order) array with unique integer elements,
    // write an algo- rithm to create a binary search tree with minimal height.


}

