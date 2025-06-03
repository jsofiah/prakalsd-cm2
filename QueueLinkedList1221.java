import java.util.Scanner;

public class QueueLinkedList1221 {
    NodeKendaraan1221 head;
    NodeKendaraan1221 tail;
    int size;

    public QueueLinkedList1221(){
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public boolean isFull(){
        return false;
    }

    public void clear(){
        if(!isEmpty()){
            head = tail = null;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void tambahData(Kendaraan1221 input){
        NodeKendaraan1221 data = new NodeKendaraan1221(input, null);
        if(isEmpty()){
            head = data;
            tail = data;
        } else {
            tail.next = data;
            tail = data;
        }
        size++;
        System.out.println(">> Kendaraan masuk ke dalam antrian");
    }
    
    public void tampilkanSemua(){
        if(!isEmpty()){
            NodeKendaraan1221 tmp = head;
            System.out.println("================================");
            System.out.println("\tAntrian Kendaraan");
            System.out.println("================================");
            while (tmp != null){
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian Kendaraan masih kosong");
        }
    }

    public void sizeAntrian(){
        System.out.println(">> Jumlah kendaraan dalam antrian: " + size);
    }

    public static void layaniKendaraan(QueueLinkedList1221 antrian, QueueTransaksi1221 transaksiQueue, Scanner sc) {
        if (!antrian.isEmpty()) {
            NodeKendaraan1221 dilayani = antrian.head;
            System.out.println("Petugas melayani " + dilayani.data.platNomor);
            antrian.head = antrian.head.next;
            antrian.size--;

            System.out.print("Masukkan nama BBM: ");
            String namaBBM = sc.nextLine();
            System.out.print("Masukkan harga per liter: ");
            double hargaPerLiter = sc.nextDouble();
            System.out.print("Masukkan jumlah liter: ");
            double liter = sc.nextDouble();
            sc.nextLine();

            BBM1221 bbm = new BBM1221(namaBBM, hargaPerLiter);
            TransaksiPengisian1221 transaksi = new TransaksiPengisian1221(dilayani.data, bbm, liter);
            transaksiQueue.enqueue(transaksi);

            System.out.println(">> Transaksi berhasil dicatat");
        } else {
            System.out.println("Antrian kosong.");
        }
    }
}
