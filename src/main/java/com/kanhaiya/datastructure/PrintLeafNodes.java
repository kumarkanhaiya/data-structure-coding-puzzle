package com.kanhaiya.datastructure;

import java.util.List;

public class PrintLeafNodes <T> {
    static class Node {
        public Node(int val) {
            this.val = val;
        }

        Node left;
        Node right;
        int val;
    }

    public static void main(String[] args) {
        
        int[] input = new int[] { 100, 80, 50, 90, 30, 60, 90, 85, 95, 120, 110, 108, 115, 140, 150 };
        Node root = null;
        for (int i : input) {
            root = insertNode(root, i);
        }

        printLeaves(root);
        System.out.println("All Nodes: ");
        printAllNodes(root);
    }

    static Node insertNode(Node root, int val) {
        if (root == null) {
            Node node = new Node(val);
            return node;
        }

        if (val > root.val) {
            root.right = insertNode(root.right, val);
        } else if (val < root.val) {
            root.left = insertNode(root.left, val);
        }
        return root;
    }

    static void printLeaves(Node root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            System.out.println(root.val + ", ");
        }
        if (root.left != null) {
            printLeaves(root.left);
        }
        if (root.right != null) {
            printLeaves(root.right);
        }
    }

    static void printAllNodes(Node root) {
        if(root == null) return;
        if(root.left == null && root.right == null){
            System.out.println(root.val +", ");
            return;
        }
        System.out.println(root.val +", ");
        if (root.left != null){
            printAllNodes(root.left);
        }
        if(root.right != null){
            printAllNodes(root.right);
        }
    }
}
