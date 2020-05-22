package E31191124_stack;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("Khusnan");
        stack.push("Ali");
        stack.push("Subarkah");

        int count = stack.count();
        Object object = stack.peek();
        System.out.println("Jumlah Data Pada Stack : " + count);
        System.out.println("Data Teratas Pada Stack : " + object);

        System.out.println("===================================");

        object = stack.pop();
        System.out.println("Objek yang dikeluarkan (Pop) : " + object);
        count = stack.count();
        System.out.println("Jumlah Data Pada Stack setelah Pop: " + count);
        object = stack.peek();
        System.out.println("Data Teratas Pada Stack setelah Pop: " + object);
    }
}
