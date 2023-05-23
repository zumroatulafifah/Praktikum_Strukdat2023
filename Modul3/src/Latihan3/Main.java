package Latihan3;


public class Main {
    private static class Stack {
        private char[] elements;
        private int top;

        // konstruktor untuk membuat objek stack
        public Stack(int capacity) {
            elements = new char[capacity];
            top = -1;
        }

        // menambah elemen ke stack
        public void push(char element) {
            if (isFull()) {
                throw new RuntimeException("Stack is full");
            }
            elements[++top] = element;
        }

        // menghapus dan mengembalikan elemen paling atas dari stuck
        public char pop() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return elements[top--];
        }

        // cek stack kosong, dikembalikan ke true
        public boolean isEmpty() {
            return top == -1;
        }

        // cek stack full, dikembalikan ke true
        public boolean isFull() {
            return top == elements.length - 1;
        }
    }

    public static void main(String[] args) {
        String input = "StrukturData";
        Stack stack = new Stack(input.length()); //kapasitas sesuai inputan
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        System.out.println("Input: "+input);
        System.out.print("Reserved: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}





//if (input.isEmpty()) {
//        System.out.println("Input is empty");
//        return;
//        } diatas for
