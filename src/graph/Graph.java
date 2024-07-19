package graph;

import java.util.*;

public class Graph {
    public static void main(String[] args) {
//        graphWithHashMap();
        graphWithAdjacencyList();
    }

    public static void graphWithHashMap() {
        Map<Character, List<Integer>> verticesEdgesMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        //  [A,B,C,D,E]
        char key;
        for (int i = 0; i < 5; i++) {
            key = (char) ('A' + i);
            List<Integer> listOfEdges = new LinkedList<>();
            System.out.println("How many no of edges there are connected with - "
                    + key);
            int noOfEdges = scanner.nextInt();
            /* Iterating each node to store their connected edges
                [B,C]
                [D,E]
                [B,E]
                [A]
                [B,A]
            */
            for (int j = 0; j < noOfEdges; j++) {
                System.out.println("Insert index of end node where starting node is " + key);
                listOfEdges.add(scanner.nextInt());
            }
            verticesEdgesMap.put(key, listOfEdges);
        }

        System.out.println(verticesEdgesMap);
    }

    public static void graphWithAdjacencyList() {
        Scanner sc = new Scanner(System.in);
        List<Character> listOfVertices = new ArrayList<>();
        //  [A,B,C,D,E,F]
        for (int i = 0; i < 6; i++) {
            listOfVertices.add((char) ('A' + i));
        }

        List<List<Integer>> listOfEdges = new ArrayList<>();
        /* Iterating each node to store their connected edges

        */
        for (int i = 0; i < listOfVertices.size(); i++) {
            List<Integer> edges = new LinkedList<>();
            System.out.println("How many no of edges there are connect with - "
                    + listOfVertices.get(i));
            int noOfEdges = sc.nextInt();
            for (int j = 0; j < noOfEdges; j++) {
                System.out.println("Insert index of end node where starting node is " + listOfVertices.get(i));
                edges.add(sc.nextInt());
            }
            listOfEdges.add(edges);
        }

        System.out.println("All vertices are - " + listOfVertices);

        System.out.println("All edges are - " + listOfEdges);
    }
}
