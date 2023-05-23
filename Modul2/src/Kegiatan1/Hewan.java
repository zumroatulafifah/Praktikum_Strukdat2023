package Kegiatan1;

import java.util.ArrayList;
import java.util.List;

public class Hewan {
    public static void main(String[] args) {

        ArrayList<String> hewanList = new ArrayList<>();

        hewanList.add("Angsa");
        hewanList.add("Bebek");
        hewanList.add("Cicak");
        hewanList.add("Domba");
        hewanList.add("Elang");
        hewanList.add("Gajah");

        //menambah elemen badak dan bebek
        hewanList.add("Badak");
        hewanList.add("Bebek");

        System.out.println("Nama Hewan : ");
        System.out.println(hewanList);


        int count = 0;
        List<Integer> indexBebek = new ArrayList<>();
        for (int i = 0; i < hewanList.size(); i++) {
            if (hewanList.get(i).equals("Bebek")) {
                count++;
                indexBebek.add(i);
            }
        }
        System.out.println("Jumlah elemen Bebek: " + count);
        System.out.println("Posisi Index = " + indexBebek);

        //menghapus posisi bebek yang pertama
        hewanList.remove(1);
        System.out.println("\nSisa Hewan : ");
        System.out.println(hewanList);

        //menampilkan elemen pada index ke 0 dan 2
        System.out.println("\nTampilkan index : ");
        System.out.println("Index ke-0: " + hewanList.get(0));
        System.out.println("Index ke-2: " + hewanList.get(2));

        //menghapus index ke 0
        hewanList.remove(0);
        System.out.println("\nSisa Hewan : ");
        System.out.println(hewanList);

        //mengubah index 0 dari cicak menjadi ular
        hewanList.set(0, "Ular");
        System.out.println("\nIndex ke-0 diganti ular : ");
        System.out.println(hewanList);

        //menambah index ke-2 menjadi itik
        hewanList.add(2, "Itik");
        System.out.println("\nTambah Hewan Baru : ");
        System.out.println(hewanList);

        //hapus elemen antara index ke-1 dan ke-5
        hewanList.subList(2, 5).clear();
        System.out.println("\nSisa Hewan : ");
        System.out.println(hewanList);

        //menampilkan elemen pertama dan terakhir
        System.out.println("\nTampilkan index pertama dan terakhir : ");
        System.out.println("Index pertama: " + hewanList.get(0));
        System.out.println("Index terakhir: " + hewanList.get(hewanList.size() - 1));

        //menampilkan jumlah elemen pada arraylist
        System.out.println("\nJumlah elemen pada ArrayList: " + hewanList.size());

        //posisi index badak
        int indexBadak = hewanList.indexOf("Badak");
        System.out.println("\nPosisi index Badak: " + indexBadak);
    }
}
