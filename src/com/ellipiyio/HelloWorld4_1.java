package com.ellipiyio;
/**
 * Created by mikeellinas on 11/2/16.
 */
public class HelloWorld4_1 {
    class Node{
        public String name;
        public Node[] children;
        public Boolean visited;
        Node(String name){
            this.name=name;
            this.children=new Node[5];
            visited=false;
        }
    }

    public static void main(String[] args) {
        System.out.println("came here");
        HelloWorld4_1 h2 = new HelloWorld4_1();
        h2.init();
        return;
    }

    void init() {
        Node start= new Node("1");
        Node end= new Node("4");

        Node num2= new Node("2");
        num2.children[0]=start;
        num2.children[1]=end;
        start.children[0]= num2;

        Node num3= new Node("3");
        start.children[1]= num3;
        System.out.println("came here");
        System.out.println(" "+findRoute( start,  end));
    }
    Boolean findRoute(Node start, Node end){
        //System.out.println("came here");
        //We are doing a DFS for simplicity
        if (start==null) return false;
        if (end==null) throw new NullPointerException();
        if (start==end) {
            System.out.print(end.name+" -> ");
            return true;
        }
        start.visited=true;
        int i=0;
        boolean flag=false;
        if (start.children==null) return false;
        while (i<start.children.length && flag==false){
            if (!start.children[i].visited)
                flag=findRoute(start.children[i],end);
            i++;
        }
        if (flag) System.out.print(start.name+" -> ");
        return flag;

    }

    //Route Between Nodes: Given a directed graph, design an algorithm to
    // find out whether there is a route between two nodes.
    //        Hints: #127





}

