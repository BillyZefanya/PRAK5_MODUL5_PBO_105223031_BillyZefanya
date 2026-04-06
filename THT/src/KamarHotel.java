public class KamarHotel {

    // atribut private untuk encapsulation
    private String nomorKamar;
    private String tipeKamar;
    private int kapasitasMaksimal;
    private double hargaPerMalam;
    private boolean isTersedia;

    // constructor cepat
    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar);
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.hargaPerMalam = 0;
        this.isTersedia = true;
    }

    // constructor lengkap
    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal, double hargaPerMalam) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar);
        this.kapasitasMaksimal = kapasitasMaksimal;
        setHargaPerMalam(hargaPerMalam);
        this.isTersedia = true;
    }

    // getter
    public String getNomorKamar() {
        return nomorKamar;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public int getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public double getHargaPerMalam() {
        return hargaPerMalam;
    }

    public boolean getStatus() {
        return isTersedia;
    }

    // setter tipe kamar dengan validasi
    public void setTipeKamar(String tipeKamar) {
        if (tipeKamar.equalsIgnoreCase("Reguler") ||
            tipeKamar.equalsIgnoreCase("Premium") ||
            tipeKamar.equalsIgnoreCase("Suite")) {

            this.tipeKamar = tipeKamar;
        } else {
            System.out.println("tipe tidak valid diubah menjadi reguler");
            this.tipeKamar = "Reguler";
        }
    }

    // setter harga dengan validasi
    public void setHargaPerMalam(double hargaPerMalam) {
        if (hargaPerMalam < 50000) {
            System.out.println("harga terlalu rendah diubah menjadi lima puluh ribu");
            this.hargaPerMalam = 50000;
        } else {
            this.hargaPerMalam = hargaPerMalam;
        }
    }

    // method overloading pesan kamar tanpa parameter
    public void pesanKamar() {
        if (isTersedia) {
            isTersedia = false;
            System.out.println("kamar berhasil dipesan");
        } else {
            System.out.println("kamar sudah terisi");
        }
    }

    // method overloading pesan kamar dengan jumlah tamu
    public void pesanKamar(int jumlahTamu) {
        if (!isTersedia) {
            System.out.println("kamar sudah terisi");
            return;
        }

        if (jumlahTamu > kapasitasMaksimal) {
            System.out.println("jumlah tamu melebihi kapasitas kamar");
        } else {
            isTersedia = false;
            System.out.println("kamar berhasil dipesan untuk " + jumlahTamu + " orang");
        }
    }

    // membatalkan pesanan
    public void batalPesan() {
        isTersedia = true;
        System.out.println("pesanan dibatalkan kamar tersedia kembali");
    }

    // hitung total tanpa voucher
    public double hitungTotalBayar(int jumlahMalam) {
        return jumlahMalam * hargaPerMalam;
    }

    // hitung total dengan voucher
    public double hitungTotalBayar(int jumlahMalam, String kodeVoucher) {
        double total = jumlahMalam * hargaPerMalam;

        if (kodeVoucher.equals("PROMO") && jumlahMalam >= 3) {
            System.out.println("diskon dua puluh persen berhasil digunakan");
            return total * 0.8;
        } else {
            System.out.println("voucher tidak berlaku");
            return total;
        }
    }

    // menampilkan informasi kamar
    public void tampilInfo() {
        System.out.println("nomor kamar " + nomorKamar);
        System.out.println("tipe kamar " + tipeKamar);
        System.out.println("kapasitas " + kapasitasMaksimal);
        System.out.println("harga " + hargaPerMalam);
        System.out.println("tersedia " + isTersedia);
        System.out.println("------------------------");
    }
}