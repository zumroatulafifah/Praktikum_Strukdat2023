package PrakLat;

public class HotelReservation {
    private class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    public HotelReservation() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Method untuk menambahkan data ke dalam queue
    public void enqueue(String data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }

        rear = newNode;
        size++;
        System.out.println("Kamar " + data + " berhasil dipesan.");
    }

    // Method untuk menghapus data dari queue
    public String dequeue() {
        if (isEmpty()) {
            return null;
        }

        String data = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;
        System.out.println("Kamar " + data + " berhasil dibatalkan.");
        return data;
    }

    // Method untuk melihat data pada front dari queue
    public String peek() {
        if (isEmpty()) {
            return null;
        }

        return front.data;
    }

    // Method untuk memeriksa apakah queue kosong
    public boolean isEmpty() {
        return size == 0;
    }

    // Method untuk mengembalikan ukuran queue
    public int size() {
        return size;
    }
}


