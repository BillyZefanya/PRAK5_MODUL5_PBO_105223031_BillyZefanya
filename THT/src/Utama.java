public class Utama {
    public static void main(String[] args) {

        // membuat objek pertama menggunakan constructor cepat
        KamarHotel kamar1 = new KamarHotel("A01", "Presidential", 3);

        // menguji setter yang salah
        kamar1.setHargaPerMalam(-10000);

        // membuat objek kedua menggunakan constructor lengkap
        KamarHotel kamar2 = new KamarHotel("B02", "Premium", 2, 200000);

        // mencoba pesan melebihi kapasitas
        kamar2.pesanKamar(4);

        // pesan sesuai kapasitas
        kamar2.pesanKamar(2);

        // mencoba pesan lagi
        kamar2.pesanKamar();

        // menghitung total pembayaran
        double total1 = kamar1.hitungTotalBayar(2, "PROMO");
        System.out.println("total kamar satu " + total1);

        double total2 = kamar2.hitungTotalBayar(4, "PROMO");
        System.out.println("total kamar dua " + total2);

        // menampilkan hasil akhir
        System.out.println("\nstruk informasi");
        kamar1.tampilInfo();
        kamar2.tampilInfo();
    }
}