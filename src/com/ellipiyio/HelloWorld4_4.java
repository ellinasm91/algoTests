package com.ellipiyio;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by mikeellinas on 11/2/16.
 */
public class HelloWorld4_4 {
    class MyBinTreeNode{
        public int number;
        public MyBinTreeNode left;
        public MyBinTreeNode right;

        //public Boolean visited;

        MyBinTreeNode(int number){
            this.number=number;
            this.left=null;
            this.right=null;
            //visited=false;
        }
    }

    public static void main(String[] args) {
        System.out.println("came here");
        HelloWorld4_4 h2 = new HelloWorld4_4();
        h2.init();
        return;
    }

    void init() {
        MyBinTreeNode head = new MyBinTreeNode(1);
        head.left= new MyBinTreeNode(2);
        head.right= new MyBinTreeNode(3);

        System.out.println(" "+checkBalanced( head));

        head = new MyBinTreeNode(1);
        head.left= new MyBinTreeNode(2);
        head.right= new MyBinTreeNode(3);
        head.left.left= new MyBinTreeNode(4);

        System.out.println(" "+checkBalanced( head));

    }

    private Boolean checkBalanced(MyBinTreeNode head) {
        //Check Balanced: Implement a function to check if a binary tree is balanced.
        // For the purposes of this question, a balanced tree is defined to be a tree
        // such that the heights of the two subtrees of any node never differ by more than one.

        if (head==null) throw new NullPointerException();
        if (head.left==null && head.right==null) return true;
        if (head.left!=null && head.right!=null)
            return (checkBalanced(head.left)&&checkBalanced(head.right));
        else return false;

    }

}

