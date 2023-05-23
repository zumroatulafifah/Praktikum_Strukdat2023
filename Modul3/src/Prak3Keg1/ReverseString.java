package Prak3Keg1;

import java.util.Scanner;

class Stack {
    private char[] items;
    private int top;

    public Stack(int size) {
        items = new char[size];
        top = -1;
    }
    //method u menyimpan string sementara
    public void push(char item) {
        items[++top] = item;
    }

    public char pop() {
        return items[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan string: ");
        String inputStr = sc.nextLine();

        int size = inputStr.length();
        Stack stack = new Stack(size);
        for (int i = 0; i < size; i++) {
            stack.push(inputStr.charAt(i));
        }
        String outputStr = "";
        while (!stack.isEmpty()) {
            outputStr += stack.pop();
        }
        System.out.println("Hasil pembalikan string: " + outputStr);
    }
}