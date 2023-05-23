package Latihan3;

public class ExampleStackTanpaLibrary {
    private String[] stack;
    private int top;

    public ExampleStackTanpaLibrary(int capacity) {
        stack = new String[capacity];
        top = -1;
    }

    public void push(String element) {
        if (top == stack.length - 1) {
            System.out.println("Stack overflow");
            return;
        }
        top++;
        stack[top] = element;
    }

    public String pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return null;
        }
        String element = stack[top];
        top--;
        return element;
    }

    public String peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int search(String element) {
        int count = 0;
        for (int i = top; i >= 0; i--) {
            if (stack[i].equals(element)) {
                count++;
            }
        }
        if (count == 0) {
            return -1;
        }
        return count;
    }

    public static void main(String[] args) {
        ExampleStackTanpaLibrary st = new ExampleStackTanpaLibrary(5);

        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");

        System.out.println("Next: " + st.peek());
        st.push("Raya");
        System.out.println(st.pop());
        st.push("!");

        int count = st.search("Aku");
        while (count != -1 && count > 1){
            st.pop();
            count--;
        }
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
    }
}

