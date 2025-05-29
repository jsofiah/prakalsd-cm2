public class TransaksiPengisian1221 {
    Kendaraan1221 kendaraan;
    BBM1221 bbm;
    double liter;
    double totalBayar;

    public TransaksiPengisian1221(Kendaraan1221 kendaraan, BBM1221 bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = liter * bbm.hargaPerliter;
    }

    public void tampilkanTransaksi() {
        System.out.println(kendaraan.platNomor + " : Rp " + totalBayar);
        // kendaraan.tampilkanInformasi();
        // System.out.println("Jenis BBM : " + bbm.namaBBM);
        // System.out.println("Liter     : " + liter);
        // System.out.println("Harga/Ltr : " + bbm.hargaPerliter);
        // System.out.println("Total Bayar: Rp " + totalBayar);
        System.out.println("================================");
    }
}
