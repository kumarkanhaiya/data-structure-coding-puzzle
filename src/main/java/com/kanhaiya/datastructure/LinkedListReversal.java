package com.kanhaiya.datastructure;

public class LinkedListReversal {
    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(null);

        printList(n1);
        Node reversed = reverseLinkedList(n1);
        printList(reversed);
    }

    public static void printList(Node node) {
        Node temp = node;
        System.out.println("\n");
        while (temp != null) {
            System.out.print(" " + temp.val);
            temp = temp.getNext();
        }
    }

    static Node reverseLinkedList(Node node) {
        if (node == null || node.next == null) return node;
        Node resNode = reverseLinkedList(node.next);
        node.next.next = node;
        node.next = null;
        return resNode;
    }
}
