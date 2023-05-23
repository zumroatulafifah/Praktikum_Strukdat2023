package Latihan3;

import java.util.Stack; //Last In First Out = item terakhir dimasukkan akan menjadi item pertama yang diambil

public class ExampleStack {
    public static void main(String[] args) {
        Stack st = new Stack();

        //menambahkan elemen dg metode push
        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");

        //mencetak nilai elemen teratas
        System.out.println("Next: " + st.peek());
        st.push("Raya");
        System.out.println(st.pop()); //menghapus dan mengembalikan elemen paling atas dari tumpukan
        st.push("!");

        //mencari index dari elemen aku dg method search
        int count = st.search("Aku");
        while (count != -1 && count > 1){ //jika tidak ada -1
            st.pop(); //mengambil elemen dan mencetaknya
            count--;
        }
        System.out.println(st.pop());
        System.out.println(st.empty()); //mengembalikan nilai true jika stuck kosong /false jika tidak ksosong
    }
}
