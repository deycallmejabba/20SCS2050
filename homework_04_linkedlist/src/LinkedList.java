/*
 * CS 2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Homework 04 - LinkedList
 */

public class LinkedList {

    private Node head;

    public LinkedList() {
        head = null;
    }

    // add in front
    public void add(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    // add tail
    public void append(int data) {
        Node newNode = new Node(data);
        if (isEmpty())
            head = newNode;
        else {
            Node current = head;
            while (current.getNext() != null)
                current = current.getNext();
            current.setNext(newNode);
        }
    }

    @Override
    public String toString() {
        String out = "";
        Node current = head;
        while (current != null) {
            out += current.toString() + " ";
            current = current.getNext();
        }
        return out;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    public int get(int index) {
        if (index < 0 || index >= size())
            return 0;
        int i = 0;
        Node current = head;
        while (i < index) {
            i++;
            current = current.getNext();
        }
        return current.getData();
    }

    public void set(int index, int data) {
        if (index < 0 || index >= size())
            return;
        int i = 0;
        Node current = head;
        while (i < index) {
            i++;
            current = current.getNext();
        }
        current.setData(data);
    }

    void insert(int index, int data) {
        if (index < 0 || index >= size())
            return;
        if (index == 0)
            add(data);
        else {
            Node newNode = new Node(data);
            int i = 0;
            Node current = head;
            while (i < index - 1) {
                i++;
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
    }

    void remove(int index) {
        if (index < 0 || index >= size())
            return;
        if (index == 0) {
            Node temp = head;
            head = head.getNext();
            temp.setNext(null);
        }
        else {
            int i = 0;
            Node current = head;
            while (i < index - 1) {
                i++;
                current = current.getNext();
            }
            Node temp = current.getNext();
            current.setNext(current.getNext().getNext());
            temp.setNext(null);
        }
    }

    // assume that the clear method does what it supposed to do
    void clear() {
        Node current = head;
        while (current != null) {
            Node temp = current.getNext();
            current.setNext(null);
            current = temp;
        }
        head = null;
    }

    // TODO: implement the invert method
    void invert() {
        // create a new linked list

        // traverse the original list, adding its elements into the new list using the "add" method

        
        // clear the original list

        // make head point to the head of the new linked list

    }
}
