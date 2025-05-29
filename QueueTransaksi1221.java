public class QueueTransaksi1221 {
    TransaksiPengisian1221[] data;
    int front;
    int rear;
    int size;
    int max;

    public QueueTransaksi1221(int max) {
        this.max = max;
        data = new TransaksiPengisian1221[max];
        front = rear = size = 0;
    }

    public void enqueue(TransaksiPengisian1221 transaksi) {
        if (size == max) {
            System.out.println("Queue transaksi penuh!");
            return;
        }
        data[rear] = transaksi;
        rear = (rear + 1) % max;
        size++;
    }

    public void tampilRiwayat() {
        if (size == 0) {
            System.out.println("Belum ada transaksi.");
            return;
        }
        // System.out.println("=== Riwayat Transaksi Pengisian BBM ===");
        int i = front;
        for (int j = 0; j < size; j++) {
            data[i].tampilkanTransaksi();
            i = (i + 1) % max;
        }
    }
}
