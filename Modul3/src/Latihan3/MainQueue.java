package Latihan3;

import java.util.LinkedList;
import java.util.Queue; //antrian

public class MainQueue {
    public void queueExample(){
        Queue queue = new LinkedList(); //digunakan untuk menyimpan string dibawah nya
        queue.add("Java");
        queue.add("DotNet");
        queue.offer("PHP");
        queue.offer("HTML"); //add dan offer digunakan untuk menambahkan elemen kedalam queue, add() akan melemparkan sebuah pengecualian berupa IllegalStateException apabila elemen tidak dapat ditambahkan ke dalam queue. Sementara itu, metode offer() hanya akan mengembalikan nilai false apabila operasi penambahan gagal.
        System.out.println("remove : " + queue.remove()); //menghapus elemen dari depan queue dan mengembalikan elemen yg dihaous
        System.out.println("element : " + queue.element()); //mengambil elemen yg berada di depan queue tanpa menghapusnya
        System.out.println("poll : " + queue.poll()); //mengambil dan menghapus elemen dari depan queue
        System.out.println("peek : " + queue.peek()); // mengambil elemen di depan queue tanpa menghapusnya
    }

    public static void main(String[] args) {
        new MainQueue().queueExample(); //mainqueue adalah objek
    }
}
