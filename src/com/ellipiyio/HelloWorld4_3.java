package com.ellipiyio;
import java.util.*;
import java.util.LinkedList;

/**
 * Created by mikeellinas on 11/2/16.
 */
public class HelloWorld4_3 {
    class Node{

        public String name;
        public Node left;
        public Node right;
        //public Boolean visited;

        Node(String name){
            this.name=name;
            this.left=null;
            this.right=null;
            //visited=false;
        }
    }

    public static void main(String[] args) {
        System.out.println("came main");
        HelloWorld4_3 h2 = new HelloWorld4_3();
        h2.init();
    }

    void init() {
        Node start= new Node("1");
        Node end= new Node("4");



        Node num2= new Node("2");       //          1
        Node num3= new Node("3");       //      2       4
                                        //  3
        num2.left=num3;
        start.right=end;
        start.left= num2;

        System.out.println("came to printer");
        ArrayList<LinkedList<Node>> res=listOfDepths( start);
        if (res==null) System.out.print("NULL");
        for (LinkedList<Node> ll: res){
            for (Node n: ll){
                System.out.print(" "+n.name+" ");
            }
            System.out.println(" ");
        }
    }

    ArrayList<LinkedList<Node>> listOfDepths(Node start){

        if (start==null) return null;
        ArrayList<LinkedList<Node>> result= new ArrayList<LinkedList<Node>>();

        LinkedList<Node> linkedList = new LinkedList<>();
        linkedList.add(start);
        LinkedList<Node> secondLinkedList ;
        while (!linkedList.isEmpty()){
            secondLinkedList = new LinkedList<Node>();
            for (Node n:linkedList){
                if (n.left!=null)
                    secondLinkedList.add(n.left);
                if (n.right!=null)
                    secondLinkedList.add(n.right);
            }
            result.add(linkedList);
            linkedList=secondLinkedList;
        }
        return result;
    }
    //List of Depths: Given a binary tree, design an algorithm which
    // creates a linked list of all the nodes at each depth (e.g., if
    // you have a tree with depth D, you'll have D linked lists).

    void BFS(Node node){
        if (node==null) return;
        LinkedList<Node> q = new LinkedList<Node>();
        ArrayList<LinkedList<Node>> result= new ArrayList<LinkedList<Node>>();
        q.add(node);
        for (Node te: result.get(result.size()-1)){
            System.out.print(te);
        }

        while(!q.isEmpty()){
            Node temp=q.remove();
            
            if (temp.left!=null) q.add(temp.left);
            if (temp.right!=null) q.add(temp.right);
            //visit(temp);
        }

    }

}

