import java.util.Scanner;
public class MainSPBU1221 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList1221 antrian = new QueueLinkedList1221();
        QueueTransaksi1221 transaksiQueue = new QueueTransaksi1221(100);

        int pilih;
        do {
            System.out.println("\n================================");
                System.out.println("\t   Menu SPBU");
                System.out.println("================================");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Antrian");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Plat Nomor    : ");
                    String plat = sc.nextLine();
                    System.out.print("Masukkan Tipe Kendaraan: ");
                    String tipe = sc.nextLine();
                    System.out.print("Masukkan Merk Kendaraan: ");
                    String merk = sc.nextLine();
                    antrian.tambahData(new Kendaraan1221(plat, tipe, merk));
                    break;

                case 2:
                    antrian.tampilkanSemua();
                    break;

                case 3:
                    antrian.sizeAntrian();
                    break;

                case 4:
                    if (!antrian.isEmpty()) {
                        NodeKendaraan1221 dilayani = antrian.head;
                        System.out.println("Petugas melayani " + antrian.head.data.platNomor);
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
                        TransaksiPengisian1221 trx = new TransaksiPengisian1221(dilayani.data, bbm, liter);
                        System.out.println(">> Transaksi berhasil dicatat");
                        transaksiQueue.enqueue(trx);
                    } else {
                        System.out.println("Antrian kosong.");
                    }
                    break;

                case 5:
                    transaksiQueue.tampilRiwayat();
                    break;

                case 0:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);

        sc.close();
    }
}
