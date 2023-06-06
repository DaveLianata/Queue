import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        // Membuat objek Queue menggunakan LinkedList
        Queue<String> queue = new LinkedList<>();

        // Menambahkan elemen ke dalam antrian
        queue.add("Elemen 1");
        queue.add("Elemen 2");
        queue.add("Elemen 3");

        // Mengakses elemen pertama dalam antrian
        String head = queue.peek();
        System.out.println("Elemen pertama: " + head);

        // Menghapus elemen pertama dalam antrian
        String removedElement = queue.poll();
        System.out.println("Elemen yang dihapus: " + removedElement);

        // Menampilkan elemen-elemen dalam antrian setelah penghapusan
        System.out.println("Elemen dalam antrian:");
        for (String element : queue) {
            System.out.println(element);
        }
    }
}


