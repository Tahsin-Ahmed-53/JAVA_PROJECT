package com.company.MyList;

public class MyList {

    public Node Head;

    public MyList() {
        this.Head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if(Head == null) {
            Head = newNode;
        } else {
            Node current = Head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public void printList() {
        Node current = Head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
