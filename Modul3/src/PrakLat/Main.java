package PrakLat;

public class Main {
    public static void main(String[] args) {
        HotelReservation hotel = new HotelReservation();

        // menambahkan data ke dalam queue
        hotel.enqueue("100");
        hotel.enqueue("102");
        hotel.enqueue("103");

        // melihat data pada front dari queue
        System.out.println("Kamar pada front: " + hotel.peek());

        // menghapus data dari queue
        hotel.dequeue();

        // memeriksa apakah queue kosong
        System.out.println("Apakah queue kosong? " + hotel.isEmpty());

        // mengembalikan ukuran queue
        System.out.println("Ukuran queue: " + hotel.size());
    }

}
