package LatihanPrak2;

import java.util.ArrayList;

public class Latihan1 {
    public static void main(String[] args) {

        //objek hewan
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");

        System.out.println("Nama Hewan Yang DiTambahakan : ");
        System.out.println(hewan);

        hewan.remove(1);
        hewan.remove(1);
        hewan.remove(1);

        //objek deletehewan
        ArrayList<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");

        System.out.println("hewan yang dihapus");
        System.out.println(deleteHewan);

        System.out.println("\nOutput Hewan Setelah DiHapus : ");
        System.out.println(hewan);
    }
}