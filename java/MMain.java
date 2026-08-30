import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insertAtHead(int value) {
        Node newNode = new Node(value);

        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

public class MMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedList list = new LinkedList();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.insertAtHead(value);
        }

        list.display();

        sc.close();
    }
}