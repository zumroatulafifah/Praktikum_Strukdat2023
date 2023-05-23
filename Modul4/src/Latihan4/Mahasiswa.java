package Latihan4;

import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama, kelas, matkulPraktikum;
    int nim;
    //class hashmap
    public Mahasiswa(String nm, String kl, String mat, int ni){
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<String, Mahasiswa>(); //objek hashmap
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Afifah", " 4B", "Sukdat A", 060));
        mhs.put("2", new Mahasiswa("Yudha", " 4B", "Sukdat A", 070));

        System.out.println("Masukkan ID : ");
        input = in.nextLine();
        data = mhs.get(input);
        if(data != null){
            System.out.println("Data Mahasiswa : " + data.nama + ", Kelas" + data.kelas + ", Mata Kuliah Praktikum : " + data.matkulPraktikum + ", nim : " + data.nim);
        }
    }
}
