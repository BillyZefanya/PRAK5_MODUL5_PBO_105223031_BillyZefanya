public class Utama {
    public static void main(String[] args) {
        Barang b = new Barang("B001", "Laptop");

        b.setKategori("Elektronik");

        b.setHargaSatuan(-5000);
        b.kurangiStok(10);

        b.setHargaSatuan(10000000);
        b.tambahStok(20);
        b.kurangiStok(5);

        b.tampilkanDetailBarang();
    }
}