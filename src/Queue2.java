import java.util.LinkedList;
import java.util.Queue;

public class Queue2 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // menambahkan elemen ke dalam queue
        queue.add("Apel");
        queue.add("Semangka");
        queue.add("Nanas");
        queue.add("Jeruk");

        //menampilkan queue
        System.out.println("Queue :" + queue);

        //menghapus elemen pertama dalam queue
        String front = queue.poll();
        System.out.println("Elemen yang dihapus :" + front);

        //menampilkan queue setelah di hapus
        System.out.println("Queue :" + queue);

        //menambahkan elemen baru ke dalam queue
        queue.add("Pisang");
        queue.add("Jambu");

        //menggunakan metode peek agar elemen setelah darielemen yang terhapus menjadi head dari queue
        String peek = queue.peek();
        System.out.println("Head queue :" + peek);

        //menampilkan queue setelah dilakukan peek
        System.out.println("Queue :" + queue);
    }
}
