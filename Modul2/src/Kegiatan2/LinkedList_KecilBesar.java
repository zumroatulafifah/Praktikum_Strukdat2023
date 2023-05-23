package Kegiatan2;

public class LinkedList_KecilBesar {
    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    public void addNode(int data) {//nmabahin data untuk d simpan di linked list

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void sortList() {
        Node current = head, index = null;

        int temp;

        if (head == null) {
            System.out.println("Data Masih Kosong!");
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public void display() {//menampilkan

        Node current = head;

        if (head == null) {
            System.out.println("Data masih kosong!");
            return;
        }
        while (current != null) {

            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        LinkedList_KecilBesar sList = new LinkedList_KecilBesar();


          sList.addNode(8);
          sList.addNode(7);
          sList.addNode(1);
          sList.addNode(4);
          sList.addNode(6);
          sList.addNode(2);
          sList.addNode(3);


        System.out.println("Before : ");
        sList.display();


        sList.sortList();

        System.out.println("After : ");
        sList.display();

    }
}
