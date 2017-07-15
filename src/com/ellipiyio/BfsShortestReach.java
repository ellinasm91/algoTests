package com.ellipiyio;

/**
 * Created by mikeellinas on 7/15/17.
 */

import java.util.*;

public class BfsShortestReach {
    public static class Graph {
        class Node{
            int num;
            Set<Node> neighbors;

            public Node(int num){
                this.num=num;
                this.neighbors=new HashSet<Node>();
            }
            public String toString(){
                return String.valueOf(num);
            }

            @Override
            public int hashCode() {
                return super.hashCode();
            }
        }

        Node[] nodeArray;
        int size;
        public Graph(int size) {
            this.size=size;
            this.nodeArray =new Node[size];
            for (int i=0; i<size ; i++){
                nodeArray[i]= new Node(i);
            }
        }

        public void addEdge(int first, int second){
            if (0>first||first>=size||0>second||second>=size) System.out.println("Invalid Edge.");
            //create connection for each node
            nodeArray[first].neighbors.add(nodeArray[second]);
            nodeArray[second].neighbors.add(nodeArray[first]);
        }

        public int[] shortestReach(int startId) { // 0 indexed
            Node start= nodeArray[startId];
            LinkedList<Node> linkedList= new LinkedList<Node>();
            linkedList.add(start);
            LinkedList<Node> secondLinkedList;
            int[] result= new int[size];
            for (int i=0; i<result.length; i++){
                result[i]=-1;
            }
            int distance=0;

            while (!linkedList.isEmpty()){

                secondLinkedList= new LinkedList<Node>();


                for (Node n : linkedList){
                    if (result[n.num]==-1) {
                        result[n.num]=distance;
                        for (Node node1: n.neighbors){
                            secondLinkedList.add(node1);
                        }
                    }
                }
                distance+=6;
                linkedList=secondLinkedList;
            }



            return result;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int queries = scanner.nextInt();

        for (int t = 0; t < queries; t++) {

            // Create a graph of size n where each edge weight is 6:
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();

            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;

                // add each edge to the graph
                graph.addEdge(u, v);
            }

            // Find shortest reach from node s
            int startId = scanner.nextInt() - 1;
            int[] distances = graph.shortestReach(startId);

            for (int i = 0; i < distances.length; i++) {
                if (i != startId) {
                    System.out.print(distances[i]);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}