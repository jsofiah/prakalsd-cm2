public class TransaksiPengisian1221 {
    Kendaraan1221 kendaraan;
    BBM1221 bbm;
    double liter;
    double totalBayar;

    public TransaksiPengisian1221(Kendaraan1221 kendaraan, BBM1221 bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        // this.totalBayar = liter * bbm.hargaPerliter;
        if(liter >= 10){
            this.totalBayar = (liter * bbm.hargaPerliter) - (0.10 * (liter * bbm.hargaPerliter)) ;
        } else{
            this.totalBayar = liter * bbm.hargaPerliter;
        }
    }

    public void tampilkanTransaksi() {
        System.out.println(kendaraan.platNomor + " : Rp " + totalBayar);
        System.out.println("================================");
    }
}
