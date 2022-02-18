package com.kanhaiya.datastructure;

public class SortedLinkedlistMerge {
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
        Node n1a = new Node(1);
        Node n1b = new Node(5);
        Node n1c = new Node(13);
        Node n1d = new Node(14);
        Node n1e = new Node(550);

        Node n2a = new Node(2);
        Node n2b = new Node(15);
        Node n2c = new Node(130);
        Node n2d = new Node(200);
        Node n2e = new Node(350);

        n1a.setNext(n1b);
        n1b.setNext(n1c);
        n1c.setNext(n1d);
        n1d.setNext(n1e);
        n1e.setNext(null);

        n2a.setNext(n2b);
        n2b.setNext(n2c);
        n2c.setNext(n2d);
        n2d.setNext(n2e);
        n2e.setNext(null);

        printList(n1a);
        printList(n2a);
        Node sortedMerge = merglinkedList(n1a, n2a);
        printList(sortedMerge);

    }

    private static Node merglinkedList(Node n1a, Node n2a) {
        if (n1a == null) {
            return n2a;
        }

        if (n2a == null) {
            return n1a;
        }

        if(n1a.val <= n2a.val){
            n1a.setNext(merglinkedList(n1a.getNext(), n2a));
            return n1a;
        } else {
            n2a.setNext(merglinkedList(n1a, n2a.getNext()));
            return n2a;
        }

    }

    public static void printList(Node node) {
        Node temp = node;
        System.out.println("\n");
        while (temp != null) {
            System.out.print(" " + temp.val);
            temp = temp.getNext();
        }
    }
}
