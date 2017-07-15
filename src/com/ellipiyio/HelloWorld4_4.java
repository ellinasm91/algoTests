package com.ellipiyio;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.regex.Matcher;

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
        head.left.left.left= new MyBinTreeNode(5);

        System.out.println(" "+checkBalanced( head));

        head.left= new MyBinTreeNode(2);
        head.right= new MyBinTreeNode(3);
        head.right.right= new MyBinTreeNode(4);
        head.right.right.left= new MyBinTreeNode(5);
        System.out.println(" "+checkBalanced( head));

    }

    private Boolean checkBalanced2(MyBinTreeNode head) {
        //Check Balanced: Implement a function to check if a binary tree is balanced.
        // For the purposes of this question, a balanced tree is defined to be a tree
        // such that the heights of the two subtrees of any node never differ by more than one.

        if (head == null) return true;
        System.out.println("Check Balanced"+head.number);
        return (checkBalanced(head.left) && checkBalanced(head.right) &&
                    Math.abs(getHeight(head.left) - getHeight(head.right)) <= 1);
    }

    int getHeight2(MyBinTreeNode node){
        if (node==null) return -1;
        System.out.println("Get Height"+node.number);

        return Math.max(getHeight(node.left),getHeight(node.right))+1;

    }
    private Boolean checkBalanced(MyBinTreeNode head) {
        //Check Balanced: Implement a function to check if a binary tree is balanced.
        // For the purposes of this question, a balanced tree is defined to be a tree
        // such that the heights of the two subtrees of any node never differ by more than one.
        return (getHeight(head)!=Integer.MIN_VALUE);
    }

    int getHeight(MyBinTreeNode node){
        if (node==null) return -1;
        System.out.println("Get Height"+node.number);

        int a= getHeight(node.left);
        if (a==Integer.MIN_VALUE) return Integer.MIN_VALUE;
        int b= getHeight(node.right);
        if (b==Integer.MIN_VALUE) return Integer.MIN_VALUE;

        //If we are here the two subtrees are balanced
        if (Math.abs(a-b)>1){
            return Integer.MIN_VALUE;
        }
        else
            return Math.max(a,b)+1;

    }
}



