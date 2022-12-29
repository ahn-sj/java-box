package ohdodok.custom.collections.list.linkedlist;

public class CustomLinkedList {

    private Node head;
    private int size;

    public CustomLinkedList() {}

    public void add(Node node) {
        Node tempNode = head;

        if(head == null) {
            head = node;
        } else {
            for (int i = 1; i < size; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = node;
        }
        size++;
    }

    public void remove(int index) {
        Node tempNode = head;

        for (int i = 0; i < index - 1; i++) {
            tempNode = tempNode.next;
        }
        tempNode.next = tempNode.next.next;
        size--;
    }

    public void printAll() {
        Node tempNode = head;
        System.out.println("head   = " + tempNode);

        for (int i = 1; i < size; i++) {
            tempNode = tempNode.next;

            System.out.println("Node " + i + " = " + tempNode);
        }
    }

    public String get(int index) {
        Node tempNode = head;

        for (int i = 0; i < index; i++) {
            tempNode = tempNode.next;
        }
        return tempNode.toString();
    }

    public static class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }
}


