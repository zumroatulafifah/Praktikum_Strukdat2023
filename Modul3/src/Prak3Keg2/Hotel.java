package Prak3Keg2;

import java.util.Scanner;

class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front, rear;

    public Queue() {
        front = rear = null;
    }

    public void enqueue(String data) {
        Node temp = new Node(data);
        if (rear == null) {
            front = rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }

    public String dequeue() {
        if (front == null)
            return null;
        Node temp = front;
        front = front.next;
        if (front == null)
            rear = null;
        return temp.data;
    }

    public String peek() {
        if (front == null)
            return null;
        return front.data;
    }

    public boolean isEmpty() { //koosng =true dan sebaliknya
        return front == null;
    }
    //kosong tru
    public int size() {
        int count = 0;
        Node temp = front;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class Hotel {
    public static void main(String[] args) {
        Queue reservations = new Queue();
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("1. Pesan Kamar Hotel");
            System.out.println("2. Batalkan Pemesanan");
            System.out.println("3. Cek Pemesanan");
            System.out.println("4. Cek Jumlah Kamar yang di pesan");
            System.out.println("5. Cek Data Paling Atas");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Masukkan nama tamu :  ");
                    String name = scanner.nextLine();
                    reservations.enqueue(name);
                    System.out.println("Kamar dipesan untuk " + name + " \n");
                    break;
                case "2":
                    String cancelled = reservations.dequeue();
                    if (cancelled == null)
                        System.out.println("Tidak ada pemesanan yang dapat dibatalkan\n");
                    else
                        System.out.println("Pemesanan dibatalkan oleh " + cancelled + " \n");
                    break;
                case "3":
                    if (reservations.isEmpty()){
                        System.out.println("Belum ada pemesanan\n");
                    }else {
                        System.out.println("Daftar nama tamu : ");
                        Node temp = reservations.front;
                        while (temp != null) {
                            System.out.println(temp.data);
                            temp = temp.next;
                        }
                    }
                    break;
                case "4":
                    System.out.println("Jumlah Kamar Pesanan : "+ reservations.size() + " \n");
                    break;
                case "5":
                    System.out.println("Data Paling Atas adalah : " + reservations.peek() + " \n");
                    break;
                case "6" :
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Invalid choice, please try again\n");
            }
        } while (!choice.equals("6"));
        scanner.close();
    }
}

