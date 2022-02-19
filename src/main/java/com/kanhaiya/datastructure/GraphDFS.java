package com.kanhaiya.datastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GraphDFS {
    static class Node {
        List<Node> neighbours = new ArrayList<>();
        int val;

        public List<Node> getNeighbours() {
            return neighbours;
        }

        public void setNeighbours(List<Node> neighbours) {
            this.neighbours = neighbours;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);
        Node node11 = new Node(11);

        connectNeighbour(node1, node2);
        connectNeighbour(node2, node3);
        connectNeighbour(node3, node4);
        connectNeighbour(node4, node5);
        connectNeighbour(node4, node7);
        connectNeighbour(node5, node6);
        connectNeighbour(node6, node9);
        connectNeighbour(node6, node10);
        connectNeighbour(node6, node11);
        connectNeighbour(node7, node8);

        Set<Node> visited = new HashSet<>();
        boolean isFound = dfs(node5, visited, 1);
        System.out.println("The goal value was found : " + isFound);
    }

    static void connectNeighbour(Node n1, Node n2) {
        n1.getNeighbours().add(n2);
        n2.getNeighbours().add(n1);
    }

    static boolean dfs(Node n1, Set<Node> visited, int goal) {
        if (n1 == null) return false;
        if (n1.val == goal) return true;

        for (Node n :
                n1.getNeighbours()) {
            if (visited.contains(n)) continue;
            System.out.println("Current nodes value is : " + n.val);
            visited.add(n);
            boolean isFound = dfs(n, visited, goal);
            if (isFound) return true;
        }
        return false;
    }

}
